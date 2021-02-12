package com.endava.soa_5ed.task5_io.ex1;

import lombok.Getter;

public enum Keys {
    DIVNUMBER1("divnumber1"),
    DIVNUMBER2("divnumber2"),
    DIVNUMBER3("divnumber3"),
    DIVNUMBER4("divnumber4"),
    DIVNUMBER5("divnumber5"),
    SCNUMBER1("scnumber1"),
    SCNUMBER2("scnumber2"),
    SCNUMBER3("scnumber3"),
    SCNUMBER4("scnumber4"),
    WORD1("word1"),
    WORD2("word2"),
    WORD3("word3"),
    WORD4("word4");

    String key;

    Keys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
