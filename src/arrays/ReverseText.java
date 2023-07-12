package arrays;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//read input from the user

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();//converts the input string into a character array using the toCharArray() method and assigns it to the characters variable.
        char[] reversed = new char[characters.length];//We also create a new character array called reversed with the same length as the characters array.

        for (int i = 0; i < characters.length; i++) {
            reversed[i] = characters[characters.length - 1 - i];
        }

        System.out.println("Reversed text: " + new String(reversed));
    }
}
