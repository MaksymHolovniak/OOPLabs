package ua.te.tk.maksym.lab0.product;

import java.math.BigDecimal;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String producer;
    private BigDecimal price;
    private int expiration;
    private int number;

    public Product(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Product id:");
        id = s.nextInt();
        s.nextLine();
        System.out.println("Enter name product:");
        name = s.nextLine();
        System.out.println("Enter producer product:");
        producer = s.nextLine();
        System.out.println("Enter price product:");
        price = s.nextBigDecimal();
        System.out.println("Enter expiration date in months:");
        expiration = s.nextInt();
        System.out.println("Enter number product:");
        number = s.nextInt();
    }

    public Product(int id, String name, String producer,
                   BigDecimal price, int expiration,
                   int number){
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.expiration = expiration;
        this.number = number;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }


    public String getProducer() {
        return producer;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public int getExpiration() {
        return expiration;
    }


    public int getNumber() {
        return number;
    }



    public String toString(){
        return "Phone {" + "id = " + id + ", name = " + name +
                ", producer = " + producer +  ", price = " + price +
                ", expiration date = " + expiration +  ", number = " +
                number + "}";
    }

}
