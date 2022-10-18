package Flowers;

import java.text.ParseException;
import java.util.Date;

public class Tulip extends Flowers{

    public String name = "Tulip";
    public Integer stem_len = 12;
    private Double price = 50.00;
    public Color color = Color.red;
    public Date ArrivalDate = sdf.parse("14.10.2022");
    public static Integer Quantity = 300;

    public Tulip(String name, int stem_len, double price, Color color, String date) throws ParseException {
        super(name, stem_len, price, color, date);
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
