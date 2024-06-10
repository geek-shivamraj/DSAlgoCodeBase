package com.geek.coreConcept.immutability;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableStudent {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public ImmutableStudent(String name, int regNo, Map<String, String> metadata) {
        this.name = name; this.regNo = regNo;
        // Won't be deep copy & any change in metadata will reflect in Student class metadata
        //  e.g., map.put("3", "third");
        // this.metadata = metadata;

        // Here we're doing deep copy so any change in metadata will not impact Student class metadata
        Map<String, String> tempMap = new HashMap<>(metadata);
        this.metadata = tempMap;
    }

    public String getName(){ return name; }
    public int getRegNo() { return regNo; }
    public Map<String, String> getMetadata() {

        // Will return the reference to the Student class Map
        // Not recommended as if you get reference you can make changes to the Map content
        // s.getMetadata().put("4", "fourth");
        // return this.metadata;

        // Here we're returning new object that's why map content won't be changed.
        Map<String, String> tempMap = new HashMap<>(this.metadata);
        return tempMap;
    }

}
