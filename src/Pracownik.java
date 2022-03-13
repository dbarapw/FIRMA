import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Pracownik {
    private String imie_pracownika;
    private int placa;
    private String adres;

    public Pracownik() {
        Scanner input = new Scanner(System.in);
        System.out.println("Imie:");
        this.imie_pracownika = input.next();
        System.out.println("Placa:");
        this.placa = input.nextInt();
        System.out.println("Adres:");
        this.adres = input.next();
    }

    public String dane() {
        String tekst = "Imie " + this.imie_pracownika + " Placa " + this.placa + " Adres " + this.adres;

        return tekst;
    }
}
