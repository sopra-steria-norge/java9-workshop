package no.soprasteria.workshop.java9.interfaces;

public class Kalkis implements IneffektivKalkulator {

    public static void main(String[] args) {
        Kalkis kalkis = new Kalkis();

        System.out.println("Partall");
        System.out.println(kalkis.sumAvParTall(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Oddetall");
        System.out.println(kalkis.sumAvOddetall(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Totalt");
        System.out.println(kalkis.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
