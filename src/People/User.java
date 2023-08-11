package People;

import Goods.Basket;
import Goods.Good;

public class User {

    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void getListOfPurchases(){
        System.out.print("The list of " + login + " purchases includes:");
        for (Good good: basket.getItems()){
            System.out.print(good.getItemName() + ", ");
        }
        System.out.println();
    }
}
