package Flowers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flowers {
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    public String name;
    public Integer stem_len;
    private Double price;
    public Color color;
    public Date ArrivalDate;
    public static Integer Quantity;

    public Flowers(String name, int stem_len, double price, Color color, String date) throws ParseException {
        this.name = name;
        this.stem_len = stem_len;
        this.price = price;
        this.color = color;
        this.ArrivalDate = sdf.parse(String.valueOf(date));
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ":" +
                " Stem Length: " + stem_len +
                ", Price: " + price +
                ", Color: " + color + ", Delivered on: " + sdf.format(ArrivalDate);
    }
}
