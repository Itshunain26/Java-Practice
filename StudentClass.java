package com.example;

public class StudentClass {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tStudent Info Display\n");

        Student s1 = new Student("Hunain Shaikh", 43);
        Student s2 = new Student("Sonny Hayes", 7);
        s1.Display();
        s2.Display();
    }
}

class Student{

    String name;
    int rollNo;

    Student(String a, int b){
         this.name = a;
         this.rollNo = b;
    }

    public void Display(){
        System.out.println("Student name : " + name);
        System.out.println("Roll number : " + rollNo + "\n");
    }

}