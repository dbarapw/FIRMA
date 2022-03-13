import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Firma {

    public static void main(String[] args) {

        ArrayList<Pracownik> lista_pracownikow = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String dzialanie;

        while (true) {
            //Pytamy o dane
            System.out.println("(d)Wprowadz dane, (l)Wyswietl liste, (x)Wyjdz");
            //Pytamy o adres
            dzialanie = input.next();
            if(dzialanie.equals("x")){
                break;
            }
            switch(dzialanie){
                case "d":
                    lista_pracownikow.add(new Pracownik());
                    break;
                case "l":
                    for(Pracownik temp : lista_pracownikow){
                        System.out.println(temp.dane());
                    }
                    break;

            }




            //try {
            //    File plik = new File("lista_pracownikow.txt");
            //    if (plik.createNewFile()) {
            //        System.out.println("Utworzono liste pracownikow");
            //    } else {
            //        System.out.println("Nie udalo sie utworzyc listy pracownikow");
            //    }
            //} catch (IOException e) {
            //    e.printStackTrace();
            //}
            //// ZAPIS DO PLIKU
            //try {
            //    FileWriter plik = new FileWriter("lista_pracownikow.txt");
            //    plik.write("zapiszmy cos na pliku");
            //    plik.write("\nzapiszmy cos na pliku");
            //    plik.close();
//
            //} catch (IOException e) {
            //    System.out.println("Nie udalo sie zapisac do pliku");
            //    e.printStackTrace();
            //}

        }
    }

}
