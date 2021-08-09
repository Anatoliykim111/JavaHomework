package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Human> parseFileToObjList(File file){
        try{
            Scanner scanner = new Scanner(file);
            List<Human> people = new ArrayList<>();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                List<String> checkPersonAge = Arrays.asList(line.split(" "));
                Human human = new Human(checkPersonAge.get(0), Integer.parseInt(checkPersonAge.get(1)));
                if (Integer.parseInt(checkPersonAge.get(1)) < 0){
                    throw new IllegalArgumentException();
                }
                people.add(human);
            }
            return people;
        }catch (FileNotFoundException f) {
            System.out.println("Файл не найден");
            return null;
        }catch (IllegalArgumentException i){
            System.out.println("Некорректный входной файл");
            return null;
        }
    }
}
