package com.example;

public class Shape {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tConstructor Overloading\n");
        Rectangle r1 = new Rectangle();
        r1.b = 12;
        r1.l = 2;
        Rectangle r2 = new Rectangle(2, 7);
        r1.area();
        r2.area();
    }
}

class Rectangle{
    int l, b;
    Rectangle(){
        this.b = this.l = 0;
    }

    Rectangle(int a, int b){
        this.l = a;
        this.b = b;
    }

    void area(){
        System.out.println("Area = " + this.l*this.b);
    }

}