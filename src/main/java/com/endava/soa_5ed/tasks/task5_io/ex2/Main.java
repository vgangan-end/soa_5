package com.endava.soa_5ed.tasks.task5_io.ex2;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileReaderClass frc = new FileReaderClass();
        ArrayList<String> wordsList = new ArrayList<>();
        try {
            wordsList = frc.transformToList("src/main/resources/top1000words.txt");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        for (String word : wordsList) {
            System.out.println(word);
        }
    }
}

