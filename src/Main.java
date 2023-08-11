import Goods.Basket;
import Goods.Category;
import Goods.Good;
import People.User;

public class Main {
    public static void main(String[] args) {
        Good chicken = new Good("chicken", 10, 5.5);
        Good cow = new Good("cow", 20, 6.0);

        Category meat = new Category("meat", new Good[]{chicken, cow});

        meat.print();

        User userOne = new User("Anna", "ahahshs", new Basket());
        User userTwo = new User("Alec", "ggg", new Basket(new Good[]{chicken, chicken, cow}));
        User userThree = new User("Alex", "3456", new Basket(new Good[]{chicken, cow}));
        User userFour = new User("Alma", "';gbbbb'", new Basket(new Good[]{chicken, cow, cow}));

       // userOne.getListOfPurchases();
        userTwo.getListOfPurchases();
        userThree.getListOfPurchases();
        userFour.getListOfPurchases();

    }


}