package sweetbox;

public class Cookie extends SweetBox {
    private String classification;

    public Cookie() {
    }

    public Cookie(String name, double weight, double price, String classification) {
        super(name, weight, price);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Cookie{" + super.toString() +
                ", classification='" + classification + '\'' +
                '}';
    }
}
