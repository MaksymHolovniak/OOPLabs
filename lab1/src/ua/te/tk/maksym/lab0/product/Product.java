package ua.te.tk.maksym.lab0.product;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String producer;
    private BigDecimal price;
    private Date expiration;
    private int amount;

    public Product() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product id:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name product:");
        name = scanner.nextLine();
        System.out.println("Enter producer product:");
        producer = scanner.nextLine();
        System.out.println("Enter price product:");
        price = scanner.nextBigDecimal();
        scanner.nextLine();
        System.out.println("Enter expiration date[dd/MM/yyyy]: ");
        String tempString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            expiration = dateFormat.parse(tempString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            expiration = new Date();
        }


        System.out.println("Enter mount product:");
        amount = scanner.nextInt();
    }

    public Product(int id, String name, String producer, BigDecimal price, Date expiration, int amount) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.expiration = expiration;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
     public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", expiration=" + expiration +
                ", amount=" + amount +
                '}';
    }
}


