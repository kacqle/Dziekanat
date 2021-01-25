package com.company;


import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Baza baza = new Baza();

        Scanner in = new Scanner(System.in);
        int wybor = -1;
        while (wybor != 0)
        {
            wybor = menu();
            switch (wybor)
            {
                case 1 -> baza.pokazStudentow();
                case 2 -> baza.dodajStudenta();
                case 3 -> baza.usunStudenta();
                case 4 -> baza.pokazKursy();
                case 5 -> baza.dodajKurs();
                case 6 -> baza.usunKurs();
                case 7 -> baza.dopiszDoKursu();
                case 8 -> baza.wypiszZKursu();
                case 9 -> baza.pokazStudentowZapisanychNaKurs();
                case 0 -> System.out.println("Koncze dzialanie");
                default -> System.out.println("Zła opcja!");

            }
        }
    }

    public static int menu()
    {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Wyświetl Studentów");
        System.out.println("     2. Dodaj Studenta");
        System.out.println("     3. Uduń Studenta");
        System.out.println("     4. Wyświetl Kursy");
        System.out.println("     5. Dodaj Kurs");
        System.out.println("     6. Uduń Kurs");
        System.out.println("     7. Dopisz do kursu");
        System.out.println("     8. Usun z kursu");
        System.out.println("     9. Wyswietl studentow na kursie");
        System.out.println("     0. Koniec");

        Scanner in = new Scanner(System.in);
        int wybor = in.nextInt();
        return wybor;
    }
}
