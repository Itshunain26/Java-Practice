package com.example;

public class BookClass {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tBook Info Display\n");
        Book s1 = new Book("The Prisoner of Azkaban", "J.K. Rowling");
        Book s2 = new Book("The Deathly Hallows", "J.K. Rowling");
        s1.Display();
        s2.Display();
    }
}

class Book{
    String title, auth;

    Book(String a, String b){
        this.title = a;
        this.auth = b;
    }

    public void Display(){
        System.out.println("Author name : " + auth);
        System.out.println("Book Title : " + title + "\n");
    }
}