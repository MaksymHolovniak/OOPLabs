package ua.te.tk.maksym.lab3.product;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String producer;
    private BigDecimal price;
    private Date expiration;
    private int amount;


    public Product(int id, String name, String producer, BigDecimal price, String expiration, int amount) throws ParseException {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.expiration = dateFormat.parse(expiration);
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", expiration=" + dateFormat.format(expiration) +
                ", amount=" + amount +
                '}';
    }
}