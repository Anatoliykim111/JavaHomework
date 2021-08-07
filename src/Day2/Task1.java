package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorAmount = scanner.nextInt();

        if (floorAmount <= 0)
            System.out.println("Ошибка ввода");
        if (floorAmount >= 1 && floorAmount <= 4)
            System.out.println("Малоэтажный дом");
        if (floorAmount >= 5 && floorAmount <= 8)
            System.out.println("Среднеэтажный дом");
        if (floorAmount >= 9)
            System.out.println("Многоэтажный дом");
    }
}
