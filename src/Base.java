import sweetbox.Candy;
import sweetbox.Chocolate;
import sweetbox.Cookie;
import sweetbox.SweetBox;

public class Base {
    public static void main(String[] args) {
        double boxWeight = 0;
        double boxCost = 0;

        Chocolate chocolate1 = new Chocolate();
        chocolate1.setType("White");
        chocolate1.setName("Toblerone");
        chocolate1.setPrice(29);
        chocolate1.setWeight(120);
        Candy candy1 = new Candy("Maddy", 10, 50, "Caramel");
        Cookie cookie1 = new Cookie("Pecan", 14, 30, "Vegan cookies");

        SweetBox[] box = {chocolate1, candy1, cookie1};
        for (SweetBox someBox: box) {
            boxWeight += someBox.getWeight();
            boxCost += someBox.getPrice();
            System.out.println(someBox.toString());
        }
        System.out.println("SweetBox weighs " + boxWeight + " and costs " + boxCost);
    }
}
