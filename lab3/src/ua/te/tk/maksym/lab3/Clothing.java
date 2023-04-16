package ua.te.tk.maksym.lab3;

import ua.te.tk.maksym.lab3.product.Product;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class Clothing extends Product {
    private String size;
    private String view;
    public  Clothing(int id, String name, String producer, BigDecimal price, String expiration, int amount, String size, String view) throws ParseException {
        super(id,name,producer,price,expiration,amount);
        this.size = size;
        this.view = view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getView() {
        return view;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "[id=" + getId() +
                "], [name='" + getName() + '\'' +
                "], [producer='" +getProducer() + '\'' +
                "], [price=" + getPrice() +
                "], [expiration=" + getExpiration() +
                "], [amount=" + getAmount() +
                "], [size='" + getSize() + '\'' +
                "], [view='" + getView() + '\'' +
                "]}";
    }
}
