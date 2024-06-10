package com.geek.java8.streamAPI.processing.models;

import lombok.Data;

import java.util.List;

@Data
public class Album {
    private String albumName;
    private int albumCost;
    private List<Artist> artists;
    public Album(String albumName, int albumCost, List<Artist> artists) {
        this.albumName = albumName; this.albumCost = albumCost; this.artists = artists;
    }
}
