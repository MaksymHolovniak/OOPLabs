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

    public String deleteWordsByCondition(){
        List<String> resultList = new ArrayList<String>(List.of(initialText.trim().split(" ")));

        for (int i = 0; i < resultList.size(); i++) {
            String word = resultList.get(i);
            if (word.length() == length && consonants.indexOf(Character.toLowerCase(word.charAt(0))) != 1) {
                resultList.remove(i);
                i--;
            }
        }
        return String.join(" ", resultList);
    }
}