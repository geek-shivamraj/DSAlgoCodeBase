package com.geek.java8.streamAPI.processing.models;

import java.util.List;

public class Artist {
    private String name;
    private boolean associatedMajorLabels;
    private List<String> majorLabels;

    public Artist(String name, boolean associatedMajorLabels, List<String> majorLabels) {
        this.name = name; this.associatedMajorLabels = associatedMajorLabels; this.majorLabels = majorLabels;
    }

}
