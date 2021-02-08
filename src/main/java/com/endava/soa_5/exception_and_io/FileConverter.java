package com.endava.soa_5.exception_and_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.endava.soa_5.exception_and_io.Constants.RESOURCE_PATH;
import static com.endava.soa_5.exception_and_io.Constants.SPLIT_REGEX;
import static java.util.regex.Pattern.compile;

public class FileConverter {

    private String outputFileName;
    private String fileName;
    private List<String> splitStringList;
    private List<String> contents;

    public FileConverter(String fileName) {
        this.fileName = fileName;
        contents = new ArrayList<>();
        splitStringList = new ArrayList<>();
    }

    public List<String> convertFileContentIntoList() {
        try {
            contents = Files.readAllLines(Paths.get(RESOURCE_PATH + fileName).toAbsolutePath());

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        return contents;
    }

    public List<String> splitList() {
        String[] temporalArray;
        for (String content : convertFileContentIntoList()) {
            temporalArray = content.split(SPLIT_REGEX);
            splitStringList.addAll(Arrays.asList(temporalArray));
        }
        return splitStringList;
    }

    public File createOutputFile() {
        if (getOutputFileName() == null) {
            setOutputFileName("DefaultOutputFileName.txt");
        }

        File newFilteredFile = new File(RESOURCE_PATH + "OutputFolder\\" + getOutputFileName());
        newFilteredFile.getParentFile().mkdirs();

        return newFilteredFile;
    }

    public void putValuesIntoOutputFileUsingRegex(String regex) {
        try {
            FileWriter fileWriter = new FileWriter(createOutputFile());
            Pattern pattern = compile(regex);

            for (String word : splitList()) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.matches()) {
                    fileWriter.write(word + "\n");
                }
            }
            fileWriter.close();
            System.out.println("File created successful in OutputFolder.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        if (outputFileName.contains(".")) {
            this.outputFileName = outputFileName;
        } else {
            this.outputFileName = outputFileName + ".txt";
        }
    }
}