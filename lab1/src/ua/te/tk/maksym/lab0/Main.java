package ua.te.tk.maksym.lab0;
import ua.te.tk.maksym.lab0.product.Product;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private Product[] products;

    public static void main(String[] args) {
        Main main = new Main();

        main.showProductByName();

        main.showProductsByPriceLower();

        main.showProductsByExpirationDateAfter();

        main.printAll();

    }

    public Main() {
        products = new Product[3];

        products[0] = new Product();
        products[1] = new Product();
    }

    public void showProductByName() {
        System.out.println("---------------------------------------");
        System.out.println("Enter the name:");
        Scanner scanner = new Scanner(System.in);
        String newName= scanner.nextLine();
        for (Product item : products) {
            if (item != null && item.getName().equals(newName))
                System.out.println(item);
        }

    }

    public void showProductsByPriceLower() {
        System.out.println("---------------------------------------");
        System.out.println("Enter the price:");
        Scanner scanner = new Scanner(System.in);
        BigDecimal newPrice = scanner.nextBigDecimal();
        for (Product item : products) {
            if (item != null && item.getPrice().compareTo(newPrice) == -1)
                System.out.println(item);
        }
    }

    public void showProductsByExpirationDateAfter() {
        System.out.println("---------------------------------------");
        System.out.println("Enter expiration date[dd/MM/yyyy]: ");
        Scanner scanner = new Scanner(System.in);
        String newExpirationString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date newExpiration;
        try {
            newExpiration = dateFormat.parse(newExpirationString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            return;
        }

        for (Product item : products) {
                    if (item != null && item.getExpiration().after(newExpiration)) {
                        System.out.println(item);
            }
        }
    }

    public void printAll() {
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

    }
}
