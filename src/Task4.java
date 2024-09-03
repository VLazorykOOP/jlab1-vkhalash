import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");

        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.println("Longest words:");
        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() < maxLength) {
                result.append(word).append(" ");
            }
        }
        System.out.println("Text without the longest words:");
        System.out.println(result);

        sc.close();
    }
}
