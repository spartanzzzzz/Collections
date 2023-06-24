package com.obsqura.training.collections;
import java.util.ArrayList;
public class Colors {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Colors in the collection:");
        for (String color : colors) {
            System.out.println(color);
        }
    }

}
