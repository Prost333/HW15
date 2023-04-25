package Serialization;

import java.io.*;
import java.util.List;

public class Auto implements Serializable {
    private String name;
    private String model;
    private int price;

    public Auto(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }


    public static void addCarinFile(List<Auto> car) {
        String file= "src/Serialization/Car.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(car);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static  void deserialization (){
        String file= "src/Serialization/Car.txt";
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file))){
            List<Auto> c=(List<Auto>) ois.readObject();
            System.out.println(c);
        }catch (Throwable e){
            throw  new RuntimeException(e);
        }
    }
}
