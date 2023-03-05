package ua.te.tk.maksym.lab0.product;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String producer;
    private BigDecimal price;
    private String expirationString;
    private int mount;

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
        s.nextLine();
        System.out.println("Enter expiration date[dd/MM/yyyy]: ");
        expirationString = s.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter mount product:");
        mount = s.nextInt();
    }

    public Product(int id, String name, String producer,
                   BigDecimal price, String expiration,
                   int mount){
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.expirationString = expirationString;
        this.mount = mount;
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

    public String getExpiration() { return expirationString; }


    public int getMount() {
        return mount;
    }



    public String toString(){
        return "Phone {" + "id = " + id + ", name = " + name +
                ", producer = " + producer +  ", price = " + price +
                ", expiration date = " + expirationString +  ", number = " +
                mount + "}";
    }

}
