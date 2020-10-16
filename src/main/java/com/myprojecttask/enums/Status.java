package com.myprojecttask.enums;

import lombok.Getter;

@Getter
public enum Status {

    OPEN("OPEN"), IN_PROGRESS("IN PROGRESS"), UAT_TESTING("UAT TESTING"), COMPLETED("COMPLETED");

    private final String value;

    Status(String value) {
        this.value = value;
    }
}
