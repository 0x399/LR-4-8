package Flowers;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Rose extends Flowers{
    public static Color color;
    public static Integer Quantity = 150;

    public Rose(String name, double stem_len, double price, Color color, String date) throws ParseException {
        super(name, stem_len, price, color, date);
    }

    public Rose() throws ParseException {
        this.name = "Rose";
        this.stem_len = 15.00;
        this.setPrice(75.00);
        this.color = Color.white;
        this.ArrivalDate = sdf.parse("14.10.2022");
    }

    public void ChangeStem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new stem length:");
        Double len = null;
        if (sc.hasNextLine()) {
            len = sc.nextDouble();
        }
        System.out.println("New stem length -" + len);
        this.stem_len = len;
    }

    public void changeColor(){
        {
            System.out.println("Change flower color to:");
            System.out.println("1 - white, 2 - black, 3 - red, 4 - yellow, 5 - purple, 6 - blue, 7 - beige");
            int input = sc.nextInt();
            switch (input){
                case 1 -> {
                    this.color = Color.white;
                    break;
                }
                case 2 -> {
                    this.color = Color.black;
                    break;
                }
                case 3 -> {
                    this.color = Color.red;
                    break;
                }
                case 4 -> {
                    this.color = Color.yellow;
                    break;
                }
                case 5 -> {
                    this.color = Color.purple;
                    break;
                }
                case 6 -> {
                    this.color = Color.blue;
                    break;
                }
                case 7 -> {
                    this.color = Color.beige;
                    break;
                }
            }
        }
    }

    public void changeDate() throws ParseException {
        System.out.println("Enter the arrival date:");
        System.out.println("(dd.mm.yyyy)");
        String date = sc.next();
        if (date.equals("back")){
            this.changeFlower();
        }
        this.ArrivalDate = sdf.parse(String.valueOf(date));
    }


    public int compareTo(Rose fl){
        int result = this.stem_len.compareTo(fl.stem_len);
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", stem_len=" + stem_len +
                ", price=" + getPrice() +
                ", color=" + color +
                ", ArrivalDate=" + ArrivalDate +
                ", Quantity=" + Quantity +
                '}';
    }
}
