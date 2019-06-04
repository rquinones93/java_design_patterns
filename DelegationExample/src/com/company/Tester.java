package com.company;

class RealPrinter {
    // The "delegate"

    void print () {
        System.out.println( "The Delegate" );
    }
}

class Printer {
    // The "delegator"
    RealPrinter printer = new RealPrinter();

    // use the delegate
    void print() {
        this.printer.print();
    }
}

class Tester {
    // To the outside world it looks like the Printer is actually printing
    public static void main(String[] args ) {
        Printer printer = new Printer();
        printer.print();
    }
}