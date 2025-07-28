package com.example;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tFactorial Finder\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
        sc.close();
    }
}
