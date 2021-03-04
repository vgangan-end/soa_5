package com.endava.soa_5ed.tasks.task5_io.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderClass {

    public ArrayList<String> transformToList(String filepath) throws IOException {
        ArrayList<String> resultList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader((filepath)));
        String line = br.readLine();
        while(line != null){
            resultList.add(line);
            line = br.readLine();
        }
        return resultList;
    }
}