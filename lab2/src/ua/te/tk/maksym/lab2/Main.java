package ua.te.tk.maksym.lab2;

import ua.te.tk.maksym.lab2.textchanger.TextChanger;

public class Main {
    public static void main(String[] args) {
        TextChanger textChanger = new TextChanger();
        System.out.println("Початковий текст:");
        System.out.println(textChanger.getInitialText());
        System.out.println("Текст після опрацювання:");
        System.out.println(textChanger.deleteWordsByCondition());
    }
}