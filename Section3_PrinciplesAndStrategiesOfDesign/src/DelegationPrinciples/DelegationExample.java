package DelegationPrinciples;

class RealPrinter {
    // The delegate

    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    // The delegator
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print() {
        p.print();
    }
}

class Tester {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}