package ua.te.tk.maksym.lab2.textchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextChanger {
    private String initialText;
    private int length;
    private String consonants = "аеєиіїоуюя";

    public TextChanger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть початковий текст:");
        initialText = scanner.nextLine();
        System.out.println("Введіть довжину слова який потрібно видалити:");
        length = scanner.nextInt();
        scanner.nextLine();
    }

    public TextChanger(String initialText, int length) {
        this.initialText = initialText;
        this.length = length;
    }

    public String getInitialText() {
        return initialText;
    }

    public void deleteWordsByCondition(){

        List<String> wordsToRemove = new ArrayList<>();

        String[] words = initialText.trim().split(" ");

        for (String word : words) {
            if (word.length() == length && consonants.indexOf(Character.toLowerCase(word.charAt(0))) != 1) {
                wordsToRemove.add(word);
            }
        }

        for (String wordToRemove : wordsToRemove) {
            initialText = initialText.replace(wordToRemove, "");
        }
    }
}