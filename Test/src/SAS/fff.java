package SAS;

import java.util.Scanner;

public class fff {
//ПРАКТИЧЕСКАЯ 2

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println(); // правая граница
    }

    public static void drawM(int size) {
        for (int i = 1; i < size - 1; i++) {
            System.out.print("*"); // левая граница
            for (int j = 1; j < size - 1; j++) {
                System.out.print(" "); // пробелы внутри для формы
            }
            System.out.println("*"); // правая граница
        }
    }

    public static void drawFr(int size) {
        if (size == 1) {
            System.out.println("*");
            return;
        }

        draw(size); //верх

        if (size > 2) {
            drawM(size);
        }

        draw(size); //вниз
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("размер рамки4 ");
        int size = scanner.nextInt();

        drawFr(size);

        scanner.close();
    }
}