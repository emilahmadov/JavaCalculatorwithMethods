package util;

import java.util.Scanner;

public class calculator {
    public static double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit:");
        double first = sc.nextDouble();
        System.out.println("Enter second digit:");
        double second = sc.nextDouble();
        System.out.println("Enter operation:(1 - plus, 2 - minus, 3 - multiplication, 4 - division");
        double operation = sc.nextDouble();

        double result = 0;

        if (operation == 1) {
            result = MathUtil.plus(first, second);
        } else if (operation == 2) {
            result = MathUtil.minus(first, second);
        } else if (operation == 3) {
            result = MathUtil.multiplication(first, second);
        } else if (operation == 4) {
            result = MathUtil.division(first, second);
        } else {
            System.out.println("Operation is not valid");
        }
        return result;
    }
}
