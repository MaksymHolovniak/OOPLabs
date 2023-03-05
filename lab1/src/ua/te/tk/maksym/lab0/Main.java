package ua.te.tk.maksym.lab0;
import ua.te.tk.maksym.lab0.product.Product;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private Product[] product;

    public static void main(String[] args) {
        Main main = new Main();

        main.showProductByName();

        main.showProductsByPriceLower();

        main.showProductsByExpirationDateUp();

        main.printAll();

    }

    public Main() {
        product = new Product[3];

        product[0] = new Product();
        product[1] = new Product();
    }

    public void showProductByName() {
        System.out.println("---------------------------------------");
        System.out.println("Enter the name:");
        Scanner newName = new Scanner(System.in);
        String nameIn = newName.nextLine();
        for (Product item : product) {
            if (item != null && item.getName().equals(nameIn))
                System.out.println(item);
        }

    }

    public void showProductsByPriceLower() {
        System.out.println("---------------------------------------");
        System.out.println("Enter the price:");
        Scanner setPriceIn = new Scanner(System.in);
        BigDecimal newPrice = setPriceIn.nextBigDecimal();
        for (Product item : product) {
            if (item != null && item.getPrice().compareTo(newPrice) == -1)
                System.out.println(item);
        }
    }


    public void showProductsByExpirationDateUp() {
        System.out.println("---------------------------------------");
        System.out.println("Enter expiration date[dd/MM/yyyy]: ");
        Scanner setExpirationIn = new Scanner(System.in);
        String newExpirationString = setExpirationIn.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date newExpiration;
        try {
            newExpiration = dateFormat.parse(newExpirationString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            return;
        }

        for (Product item : product) {
            if (item != null) {
                try {
                    Date expiration = dateFormat.parse(item.getExpiration());
                    if (expiration.compareTo(newExpiration) > 0) {
                        System.out.println(item);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid date format for product with ID " + item.getId() + ". Please use dd/MM/yyyy.");
                }
            }
        }
    }

    public void printAll() {
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }

    }
}
