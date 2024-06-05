package com.mycompany.cots.mkpl;

import java.util.Scanner;

public class CotsMkpl1302213103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Choose operation (+, -, *, /): ");
        String operation = scanner.next();
        
        int result;
        switch (operation) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
