package org.example;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        String vowelString = "A E I O U a e i o u";
        String consonantString = "B C D F G H J K L M N " +
                "P Q R S T V W X Y Z " +
                "b c d f g h j k l m n p q r s t v w x y z";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any character: ");
        String character = input.nextLine();

        if (vowelString.contains(character)) {
            System.out.println("The input character is a vowel");
        }
        else if (consonantString.contains(character)) {
            System.out.println("The input character is a consonant");
        }
        else {
            System.out.println("The input character is neither vowel nor consonant");
        }

    }
}
