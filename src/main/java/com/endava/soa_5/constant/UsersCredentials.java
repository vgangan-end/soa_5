package com.endava.soa_5.constant;

import lombok.Getter;

@Getter
public enum UsersCredentials {
    EDUARD("gafax88355@fironia.com", "eduard_soa5"),
    DUMITRU("", ""),
    NADEJDA("", ""),
    DANIELA("", ""),
    VEACESLAV("", "");

    String email;
    String password;

    UsersCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }
}

