package Flowers;

import java.text.ParseException;
import java.util.Date;

public class Tulip extends Flowers{
    public static Color color;
    public static Integer Quantity = 300;

    public Tulip(String name, double stem_len, double price, Color color, String date) throws ParseException {
        super(name, stem_len, price, color, date);
    }

    public Tulip() throws ParseException {
        super();
        this.name = "Tulip";
        this.stem_len = 12.00;
        this.setPrice(50.00);
        this.color = Color.red;
        this.ArrivalDate = sdf.parse("19.10.2022");
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "name='" + name + '\'' +
                ", stem_len=" + stem_len +
                ", price=" + getPrice() +
                ", color=" + color +
                ", ArrivalDate=" + ArrivalDate +
                ", Quantity=" + Quantity +
                '}';
    }
}
