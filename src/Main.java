import Flowers.*;
import Decorations.*;
import Bouquet.*;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static Flowers tulip1, tulip2;

    static Bouquet bouquet = new Bouquet();
    static Scanner sc = new Scanner(System.in);
    static String date = sc.nextLine();



    static {
        try {
            tulip1 = new Tulip("Tulip", 12, 40, Color.red, date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            tulip2 = new Tulip("Tulip", 12, 40, Color.white, "16.05.2022");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        System.out.println(tulip1);
        System.out.println(tulip2);
        bouquet.AddToBouquet(tulip1);
        bouquet.AddToBouquet(tulip2);
        System.out.println(bouquet);

    }
}
