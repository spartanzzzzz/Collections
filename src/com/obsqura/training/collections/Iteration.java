package com.obsqura.training.collections;
import java.util.ArrayList;
public class Iteration {
public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Iterating through the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }

}
