package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("\t\tHunain Shaikh 241P043");
    System.out.println("\t\tOdd or Even Checker:\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    if(number % 2 == 0){
        System.out.println(number + " is an even number.");
    }
    else{
        System.out.println(number + " is an odd number.");
        }
        sc.close();
    }
}
