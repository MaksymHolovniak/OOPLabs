package ua.te.tk.maksym.lab0;
import ua.te.tk.maksym.lab0.product.Product;

import java.util.Scanner;

public class Main {
    private Product[] product;
    public static void main(String[] args) {
        Main main = new Main();

        main.showDateProduct();

        main.showDateProductDown();

        main.showDateProductUp();

        main.printAll();

    }

    public Main(){
        product = new Product[3];

        product[0] = new Product (1,"Milk", "LimitCompany",50,12,150);
        product[1] = new Product();
    }
    public void showDateProduct(){
        System.out.println("---------------------------------------");
        System.out.println("Enter the name:");
        Scanner newName = new Scanner(System.in);
        String nameIn = newName.nextLine();
        for (Product item: product) {
            if (item != null && item.getName().equals(nameIn))
                System.out.println(item.toString());
        }

    }

    public void showDateProductDown(){
        System.out.println("---------------------------------------");
        System.out.println("Enter the price:");
        Scanner setPriceIn = new Scanner(System.in);
        double newPrice = setPriceIn.nextDouble();
        for (Product item: product) {
            if (item != null && item.getPrice() < newPrice)
                System.out.println(item.toString());
        }

    }

    public void showDateProductUp(){
        System.out.println("---------------------------------------");
        System.out.println("Enter the expiration date in months:");
        Scanner setExpirationIn = new Scanner(System.in);
        int newExpiration = setExpirationIn.nextInt();
        for (Product item: product) {
            if (item != null && item.getExpiration() > newExpiration)
                System.out.println(item.toString());
        }

    }

    public void printAll(){
        System.out.println("---------------------------------------");
        for (int i = 0; i< product.length; i++) {
            System.out.println(product[i]);
        }

    }
}
