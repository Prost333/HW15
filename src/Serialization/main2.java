package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class main2 {
    public static void main(String[] args) {
        Auto car1= new Auto("BMW","X5",100);
        Auto car2= new Auto("WV","polo",70);
        Auto car3= new Auto("Audi","tt",110);
        List<Auto> autos=new ArrayList<>();
        autos.add(car1);
        autos.add(car2);
        autos.add(car3);

        Auto.addCarinFile(autos);
        Auto.deserialization();


    }
}
