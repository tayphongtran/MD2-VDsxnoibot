package SortStrWraperObj;

import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExn {
    public static void main(String[] args) {
        List<Float> floats = new ArrayList<>();
        floats.add(4f);
        floats.add(24f);
        floats.add(14f);
        floats.add(34f);
        floats.add(4f);

        Collections.sort(floats);
        System.out.println("list : ");
        for (Float item :
                floats) {
            System.out.println("nhan duoc : " + item);
        }

        floats.forEach((item)-> {
            System.out.println(item + " con cu");
        });

        Collections.sort(floats, new  Comparator<Float>() {;;
            @Override
            public int compare(Float o1, Float o2) {

                return o1 > o2 ? 1 : -1;
            }
        });
        floats.forEach((items) ->{
            System.out.println(items + "con to");
        });
    }
}
