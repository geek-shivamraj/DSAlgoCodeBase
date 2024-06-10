package com.geek.java8.streamAPI.processing.models;

import lombok.Data;

@Data
public class Pair {
    private String key;
    private String value;
    public Pair(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
