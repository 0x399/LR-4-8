package Flowers;

import java.text.ParseException;
import java.util.Date;

public class Rose extends Flowers{

    public String name = "Rose";
    public Integer stem_len = 15;
    private Double price = 75.00;
    public Color color = Color.red;
    public Date ArrivalDate = sdf.parse("14.10.2022");
    public static Integer Quantity = 150;

    public Rose(String name, int stem_len, double price, Color color, String date) throws ParseException {
        super(name, stem_len, price, color, date);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", stem_len=" + stem_len +
                ", price=" + price +
                ", color=" + color +
                ", ArrivalDate=" + ArrivalDate +
                ", Quantity=" + Quantity +
                '}';
    }
}
