package Flowers;

public class Flowers {
    public String name;
    public Integer stem_len;
    private Double price;
    public Color color;

    public Flowers(String name, int stem_len, double price, Color color) {
        this.name = name;
        this.stem_len = stem_len;
        this.price = price;
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower: " +
                "Name:'" + name + '\'' +
                ", Stem Length: " + stem_len +
                ", Price: " + price +
                ", Color: " + color;
    }
}
