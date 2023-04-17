package ua.te.tk.maksym.lab3;

import ua.te.tk.maksym.lab3.product.Product;

import java.math.BigDecimal;
import java.text.ParseException;

public class Food extends Product {
    private double expirationDate;
    private String productComponents;

    public Food(int id, String name, String producer, BigDecimal price, String expiration, int amount, double expirationDate, String productComponents) throws ParseException {
        super(id, name, producer, price, expiration, amount);
        this.expirationDate = expirationDate;
        this.productComponents = productComponents;
    }

    public void setExpirationDate(double expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setProductComponents(String productComponents) {
        this.productComponents = productComponents;
    }

    public double getExpirationDate() {
        return expirationDate;
    }

    public String getProductComponents() {
        return productComponents;
    }

    @Override
    public String toString() {
        return "Food{" +
                "[id=" + getId() +
                "], [name='" + getName() + '\'' +
                "], [producer='" + getProducer() + '\'' +
                "], [price=" + getPrice() +
                "], [expiration=" + getExpiration() +
                "], [amount=" + getAmount() +
                "], [expirationDate='" + getExpirationDate() + '\'' +
                "], [productComponents='" + getProductComponents() + '\'' +
                "]}";
    }
}
