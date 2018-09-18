package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static String konwersja(String ciag) {
        char x[] = ciag.toCharArray();

        for(int i=0; i != x.length; i++){
            int n = x[i];
            n += 3;
            if(n == 123)
                n = 97;
            if(n == 124)
                n = 98;
            if(n == 125)
                n = 99;
            x[i] = (char)n;
        }

        ciag = new String(x);
        return ciag;
    }

    public static String dekonwersja(String ciag) {
        char x[] = ciag.toCharArray();

        for(int i=0; i != x.length; i++){
            int n = x[i];
            n -= 3;
            if(n == 97)
                n = 123;
            if(n == 98)
                n = 124;
            if(n == 99)
                n = 125;
            x[i] = (char)n;
        }

        ciag = new String(x);
        return ciag;
    }

    public static void main(String[] args) {
        Scanner Dane = new Scanner(System.in);

        System.out.print("Proszę wprowadzić hasło do konwersji: ");
        String haslo = Dane.nextLine();

        System.out.println("Co mam zrobić?");
        System.out.println("1. Konwersja");
        System.out.println("2. Dekonwersja");
        int ktore = Dane.nextInt();
        
switch(ktore) {
          case 1:
               System.out.println(konwersja(haslo));
               break;
          case 2:
               System.out.println(dekonwersja(haslo));
               break;
          default:
               System.out.println("Nieobsługiwany rodzaj. Proszę spróbować ponownie");
    }
}
