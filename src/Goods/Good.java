package Goods;

public class Good {
    private String itemName;
    private Integer price;
    private double rating;

    public Good(String itemName, int price, double rating) {
        this.itemName = itemName;
        this.price = price;
        this.rating = rating;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void print() {
        System.out.println(itemName + ", " + price + ", " + rating);
    }
}
