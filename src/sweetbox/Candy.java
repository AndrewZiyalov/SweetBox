package sweetbox;

public class Candy extends SweetBox {
    private String type;

    public Candy() {
        this.type = type;
    }

    public Candy(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy{" + super.toString() +
                ", type='" + type + '\'' +
                '}';
    }
}
