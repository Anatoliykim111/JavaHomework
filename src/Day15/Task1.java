package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        try{
            File readFile = new File("/Users/mm2/IdeaProjects/JavaHomework/src/main/resources/shoes.csv");
            Scanner scanner = new Scanner(readFile);
            List<String> shoes = new ArrayList<>();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] checkAmountShoes = line.split(";");
                if(Integer.parseInt(checkAmountShoes[2]) == 0){
                    shoes.add(line);
                }
            }
            PrintWriter pw = new PrintWriter("newFile.txt", "UTF-8");
            for (String shoe : shoes) {
                pw.println(shoe);
            }
            pw.close();
        }catch(FileNotFoundException | UnsupportedEncodingException f){
            System.out.println("Файл не найден");
        }
    }
}
