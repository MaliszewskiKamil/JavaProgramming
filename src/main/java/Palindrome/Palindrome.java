package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(String word) {
        String wordFiltered = filter(word);
        String wordReversed = reverse(wordFiltered);
        return wordReversed.equals(wordFiltered);
    }

    private static String filter(String word) {
        StringBuilder sb = new StringBuilder(word.length());
        for (char character : word.toCharArray()) {
            if (Character.isLetterOrDigit(character))
                sb.append(character);
        }
        return sb.toString();
    }

    private static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word.length());
        sb.append(word).reverse();
        return sb.toString();
    }
}
