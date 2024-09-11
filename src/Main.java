
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //tablica
        //musi miec z gory okreslony rozmiar
        // nie mozna go pozniej zmienic
        //elementem tablicy moga byc typy proste i zlozone
        //tablica z wartosciamy losowym od 1 do 100 6 elementow
        int tablicaLosowa[]= new int[6];
        for (int i = 0; i < tablicaLosowa.length; i++) {
            tablicaLosowa[i]=(int) (Math.random()*100+1);

        }
        //wypisywanie elementow tablicy
        
        for (int element:tablicaLosowa) {
            System.out.print(element+", ");
        }
              //kolekcje, elementy typami zlozonymi
        //nie musza miec zdefinowanego rozmiaru 
        //rozmiar w trakcie moze zmieniac
              //listy List, zbiory Set, mapy
        
            //wstawianie liczb z klawiatury do kolekcji
            List<Integer> ListaLiczbWpisanych = new ArrayList<>();
            System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i <6; i++) {
            int liczba = klawiatura.nextInt();
            ListaLiczbWpisanych.add(liczba);
        }
System.out.println("Wstawiono liczby:");
        for (Integer LiczbaWpisana:ListaLiczbWpisanych
             ) {
            System.out.println(LiczbaWpisana);
        }

        //Wypisawanie inaczej
        for (int i = 0; i < ListaLiczbWpisanych.size(); i++) {
            System.out.println(ListaLiczbWpisanych.get(i));
        }
        //losowanie liczb bez powtorzen
        ArrayList<Integer>ListaLosowychBezPowrorzen = new ArrayList<>();
        for (int i = 0; i <6; i++) {
            int liczba = (int)(Math.random()*100+1);
            while (ListaLosowychBezPowrorzen.contains(liczba)){
                liczba= (int)(Math.random()*100+1);
            }
            ListaLosowychBezPowrorzen.add(liczba);
        }
        //wypisywanie
        System.out.println("wylosowane bez powtorzen");
        System.out.println(ListaLosowychBezPowrorzen);
    }
}