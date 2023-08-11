package Goods;

import java.util.Arrays;

public class Basket {

    private Good[] items;

    public Basket() {
    }

    public Basket(Good[] items) {
        this.items = items;
    }

    public Good[] getItems() {
        return items;
    }

    public void setItems(Good[] items) {
        this.items = items;
    }

    public void print() {
        System.out.println("The basket contains: ");
        for (Good item : items) {
            item.print();
        }
    }
}
