package com.obsqura.training.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ElementSearch {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the color to search: ");
			String searchColor = scanner.nextLine();
			boolean found = colors.contains(searchColor);
			if (found) {
			    System.out.println(searchColor + " found in the list.");
			} else {
			    System.out.println(searchColor + " not found in the list.");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
    }

}
