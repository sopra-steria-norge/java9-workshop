package no.soprasteria.workshop.java9.printer;

// import no.soprasteria.workshop.java9.splitter.Splitter;

import no.soprasteria.workshop.java9.verifier.Verifier;

public class Printer {

    private static void theWorldsDumbestPrint(String lineToPrint) {
        lineToPrint.chars().forEach(c -> printChar((char) c));
        printChar('\n');
    }

    private static void printChar(char c) {
        System.out.print(c);
    }

    public static void main(String[] args) {
        Verifier verifier = new Verifier();

        theWorldsDumbestPrint(verifier.returnOnlyVerifiedCharacters("!!!!JAVA 9 Modules!!!!"));
        theWorldsDumbestPrint(verifier.returnOnlyVerifiedCharacters("Kan jeg bruke Splitter eller Combiner her tro?"));

//        new Splitter().wordSplitter("Ja eller nei?");
    }
}
