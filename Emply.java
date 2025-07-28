package com.example;

public class Emply {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tEmployee Details\n");
        Employee e1 = new Employee(01, "Maaz");
        Employee e2 = new Employee(02, "Jed");
        e1.getDetails();
        System.out.println();
        e2.getDetails();
        System.out.println();
        Employee.compName("Microsoft");
        e1.getDetails();
        System.out.println();
        e2.getDetails();

    }
}

class Employee{
    public static String companyName = "DevSparks";
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void compName(String a){
        companyName = a;
    }

    public void getDetails(){
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee id : " + this.id);
        System.out.println("Company name : " + companyName);
    }
}
