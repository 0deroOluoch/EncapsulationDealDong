package com.appnetics;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50,false);
        System.out.println("Initial pages count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for ptinter = "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for ptinter = "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for ptinter = "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for ptinter = "+ printer.getPagesPrinted());

    }
}
