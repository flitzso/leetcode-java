package the_greatest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int greatest = (a + b + Math.abs(a - b)) / 2;
        greatest = (greatest + c + Math.abs(greatest - c)) / 2;

        System.out.println(greatest + " and the greatest");

        scanner.close();
    }
}

