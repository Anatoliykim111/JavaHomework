package Day12.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> autoList = new ArrayList<>();
        autoList.add("BMW");
        autoList.add("Toyota");
        autoList.add("Mitsubishi");
        autoList.add("Ford");
        autoList.add("Fiat");

        autoList.remove(0); //удален первый автомобиль
        autoList.add(2,"Chevrolet");//добавлен автомобиль в середину списка

        System.out.println(autoList);
    }
}
