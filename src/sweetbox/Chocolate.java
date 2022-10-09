package sweetbox;

public class Chocolate extends SweetBox {
    private String type;

    public Chocolate() {
    }

    public Chocolate(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String color) {
        this.type = color;
    }

    @Override
    public String toString() {
        return "Chocolate{" + super.toString() +
                ", color='" + type + '\'' +
                '}';
    }
}
