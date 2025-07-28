package com.example;
import java.util.Scanner;

public class ScannerProg {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tInput Using Scanner\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your marks : ");
        double marks = sc.nextDouble();
        System.out.println("\n\t\tStudent Details:");
        System.out.println("Student name : " + name + "\nStudent age : " + age + "\nStudent marks : " + marks);
        sc.close();
    }
}
