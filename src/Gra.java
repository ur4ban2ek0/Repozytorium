import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private static ArrayList<Integer> wylosowane=new ArrayList<>();
    private ArrayList<Integer> wpisane;
    private LinkedList<Integer> trafione;

    private void wylosujLiczby(int ile){

        while (wylosowane.size()<ile){
            int liczba = (int)(Math.random()*100+1);
            while(wylosowane.contains(liczba)){
                liczba= (int)(Math.random()*100+1);
            }
            wylosowane.add(liczba);
        }

    }
    private void wpiszLiczbyZKlawiatury(int ile){
        wpisane = new ArrayList<>();
        System.out.println("podaj "+ile+" liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }

    }
    private void wypiszKolekcję(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println("Element:"+element);
        }
    }
    private void zwrocTrafione(){
        trafione =new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana: wpisane) {
            if(wylosowane.contains(wpisana)){
                trafione.add(wpisana);
            }
        }

    }

    public void zagraj(){
        wylosujLiczby(6);
        wpiszLiczbyZKlawiatury(6);
        zwrocTrafione();
        System.out.println("Wpisano");
        wypiszKolekcję(wpisane);
        System.out.println("Wylosowano");
        wypiszKolekcję(wylosowane);
        System.out.println("Trafiono");
        wypiszKolekcję(trafione);
    }

}
