package Goods;

public class Category {
    private String itemName;
    private Good[] goods;

    public Category(String itemName, Good[] goods) {
        this.itemName = itemName;
        this.goods = goods;
    }

    public String getItemName() {
        return itemName;
    }

    public Good[] getGoods() {
        return goods;
    }

    public void print() {
        System.out.println(itemName + ": ");
        for (Good good : goods) {
           good.print();
        }
    }
}
