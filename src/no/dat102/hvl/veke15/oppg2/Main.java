package no.dat102.hvl.veke15.oppg2;

public class Main {
    public static void main(String[] args) {
        BS_Tre<Integer> tre = new BS_Tre<>();

        tre.settInn(10);
        tre.settInn(5);
        tre.settInn(15);
        tre.settInn(3);
        tre.settInn(7);
        tre.settInn(18);

        tre.skrivVerdier(6, 16);
    }
}
