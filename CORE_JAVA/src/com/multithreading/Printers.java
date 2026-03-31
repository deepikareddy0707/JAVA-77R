package com.multithreading;

class Printer {
    private int paperCount;

    public Printer(int paperCount) {
        this.paperCount = paperCount;
    }

    public synchronized void printDocument(String document, String userName) {
        if (paperCount > 0) {
            System.out.println(userName + " is printing: " + document);
            paperCount--;
            System.out.println("Remaining papers: " + paperCount);
        } else {
            System.out.println(userName + " cannot print. No paper left!");
        }
    }
}

class User extends Thread {
    private String name;
    private Printer printer;
    private String document;

    public User(String name, Printer printer, String document) {
        this.name = name;
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.printDocument(document, name);
    }
}

public class Printers {
    public static void main(String[] args) {

        Printer printer = new Printer(3);

        User u1 = new User("User-1", printer, "Doc1");
        User u2 = new User("User-2", printer, "Doc2");
        User u3 = new User("User-3", printer, "Doc3");
        User u4 = new User("User-4", printer, "Doc4");

        u1.start();
        u2.start();
        u3.start();
        u4.start();
    }
}