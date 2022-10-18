package Bouquet;

import java.util.ArrayList;
import Decorations.Decorations;
import Flowers.Flowers;

public class Bouquet {
    ArrayList<Flowers> flowersArr = new ArrayList<Flowers>();
    ArrayList<Decorations> decorArr = new ArrayList<Decorations>();

    public ArrayList<Flowers> AddToBouquet(Flowers flower) {
        flowersArr.add(flower);
        return flowersArr;
    }

    public ArrayList<Decorations> AddToBouquet(Decorations dec) {
        decorArr.add(dec);
        return decorArr;
    }

    @Override
    public String toString() {
        for (int i = 0; i < flowersArr.size(); i++) {
            System.out.println(flowersArr.get(i));
        }
        for (int i = 0; i < decorArr.size(); i++) {
            System.out.println(decorArr.get(i));
        }
        return " ";
    }
}
