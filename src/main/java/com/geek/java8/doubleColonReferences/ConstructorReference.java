package com.geek.java8.doubleColonReferences;

class Sample {
    private String s;
    Sample(String s) {
        this.s = s;
        System.out.println("Constructed Executed: " + s);
    }
}

interface Interf1 {
    public Sample get(String s);
}

public class ConstructorReference {
    public static void main(String[] args) {
        Interf1 f1 = s -> new Sample(s);
        f1.get("From Lambda Expression");

        // Functional interface Interf1 f2 refering Sample class constructor
        Interf1 f2 = Sample::new;
        f2.get("From Constructor Reference");
    }
}
