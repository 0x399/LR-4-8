package Flowers;

import java.text.ParseException;
import java.util.Date;

public class Tulip extends Flowers{

    public String name = "Tulip";
    public double stem_len = 12.00;
    private Double price = 50.00;
    public static Color color = Color.red;
    public static Date ArrivalDate;

    static {
        try {
            ArrivalDate = sdf.parse("14.10.2022");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer Quantity = 300;

    public Tulip(String name, double stem_len, double price, Color color, String date) throws ParseException {
        super(name, stem_len, price, color, date);
    }

    public Tulip() throws ParseException {
        super();
        this.name = "Tulip";
        this.stem_len = 12.00;
        this.price = 50.00;
        this.color = Color.red;
        this.ArrivalDate = sdf.parse("14.10.2022");
        this.Quantity = 300;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "name='" + name + '\'' +
                ", stem_len=" + stem_len +
                ", price=" + price +
                ", color=" + color +
                ", ArrivalDate=" + ArrivalDate +
                ", Quantity=" + Quantity +
                '}';
    }
}
