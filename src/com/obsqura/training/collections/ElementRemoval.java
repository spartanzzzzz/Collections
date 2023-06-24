package com.obsqura.training.collections;
import java.util.ArrayList;
public class ElementRemoval {
public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("ArrayList before removing any elements:");
        for (String colour : colors) {
            System.out.println(colour);
        }
        int indexToRemove = 2; 
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            String removedElement = colors.remove(indexToRemove);
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Invalid index specified.");
        }
        System.out.println("ArrayList after removing the third element:");
        for (String color : colors) {
            System.out.println(color);
        }
      }
}


