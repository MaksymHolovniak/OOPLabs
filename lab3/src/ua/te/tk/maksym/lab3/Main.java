package ua.te.tk.maksym.lab3;
import ua.te.tk.maksym.lab3.product.Product;

import java.text.ParseException;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Product> productArray=new ArrayList<Product>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        productArray.add(new Product(0,"Maksym","MilkDB",new BigDecimal("38.1"),"20/02/2023",200));
        productArray.add(new Food(1,"Sofiya","Compass",new BigDecimal("40.3"),"21/01/2023",220,12,"milk,chocolate,water,sugar"));
        productArray.add(new Clothing(2,"Denys","MultiDK",new BigDecimal("39.6"),"22/01/2023",220,"M","Blouse"));
        productArray.add(new Food(3,"Dima","BasicSG",new BigDecimal("41.9"),"23/01/2023",230,24,"cheese, bread, sausage"));
        for(Object i:productArray){
            System.out.println(i.toString());
        }
    }
}