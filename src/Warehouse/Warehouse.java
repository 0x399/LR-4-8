package Warehouse;

import Decorations.Decorations;
import Flowers.Flowers;
import Flowers.Rose;
import Flowers.Tulip;
import Flowers.Chrisanthemum;
import Menu.Menu;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
    Scanner sc = new Scanner(System.in);
    public int capacity = 2000;
    ArrayList<Flowers> flowersArr = new ArrayList<Flowers>();
    ArrayList<Decorations> decorArr = new ArrayList<Decorations>();

    public void AddFlower(Flowers flower) {
        flowersArr.add(flower);
    }

    public Flowers TakeFlower(String fl_name) {
        for (int i = 0; i < flowersArr.size(); i++) {
            if (flowersArr.get(i).name == fl_name) {
                Flowers tmp = flowersArr.get(i);
                flowersArr.remove(flowersArr.get(i));
                return tmp;
            }
        }
        return null;
    }

    public static void display() throws ParseException {
        System.out.println("Roses:");
        System.out.println("Quantity:");
        System.out.println(Rose.Quantity);
        System.out.println("Color:");
        System.out.println(Rose.color);
        System.out.println("Delivered on:");
        System.out.println(Rose.ArrivalDate);
        System.out.println("Tulips:");
        System.out.println("Quantity:");
        System.out.println(Tulip.Quantity);
        System.out.println("Color:");
        System.out.println(Tulip.color);
        System.out.println("Delivered on:");
        System.out.println(Tulip.ArrivalDate);
        System.out.println("Chrysanthemums:");
        System.out.println("Quantity:");
        System.out.println(Chrisanthemum.Quantity);
        System.out.println("Color:");
        System.out.println(Chrisanthemum.color);
        System.out.println("Delivered on:");
        System.out.println(Chrisanthemum.ArrivalDate);
        Menu menu = new Menu();
        menu.menu();
    }
}
