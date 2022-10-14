package grocery;

import java.util.ArrayList;
import java.util.Comparator;

public class Grocery {


    private String name;
    private String category;
    private int quantity;


    public Grocery(int quantity, String name, String category) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Item: "+ this.getName() +" Quantity: "+ this.getQuantity() +" Category: "+ this.getCategory();
    }


    }



