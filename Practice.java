package com.example;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tPractice\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get converted : ");
        int n = sc.nextInt(), i = 1; 
        int res[] = new int[100];
        while( n!=0 ){
            res[i++] = n%2;
            n /= 2;
        }
        for(int j = i-1; j > 0; j--){
            System.out.print(res[j]);
        }
        sc.close();
    }
}
