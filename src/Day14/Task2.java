package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        try{
            Scanner scanner = new Scanner(file);
            List<String> people = new ArrayList<>();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                List<String> checkPersonAge = Arrays.asList(line.split(" "));
                if (Integer.parseInt(checkPersonAge.get(1)) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
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
