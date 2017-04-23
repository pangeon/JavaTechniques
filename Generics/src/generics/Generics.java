
package generics;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList car_list = new ArrayList();
        car_list.add("Mazda");
        car_list.add("Polonez");
        car_list.add("Ferrari");
        car_list.add("Alfa Romeo");
        car_list.add(239);
        //----------------------------------
        System.out.println("Lista Niegeneryczna");
        try {
            for (Object car : car_list) { // zamiast foreach można użyć lambda
                
                System.out.println((String) car); 
            }
        } catch (ClassCastException e) {
            System.out.println("Przechwycono wyjątek - niezgodność typów");
            String message = e.getMessage();
            System.out.println(message);
        } finally {
            System.out.println("Koniec programu.");
        }
        //----------------------------------
        // deklaracja typu występuje tylko w jednym miejscu (JAVA8)
        System.out.println("");
        ArrayList<String> car_list_2 = new ArrayList<>(); // dawniej new ArrayList<String>();
        car_list_2.add("Cinquecento");
        car_list_2.add("Opel");
        car_list_2.add("Syrenka");
        car_list_2.add("BMW");
        // car_list_2.add(239); w tym wypadku instrukcja niemożliwa do wykonania
        System.out.println("Lista Generyczna");
        try {
            car_list_2.forEach((/*String*/ car) -> { // wykorzystuje wyrażenia lambda
                //w przypadku funkcji forEach deklarowanie typu jest opcjonalne
                //w przypadku pętli foreach jest konieczne
                
                System.out.println( /*(String)*/ car); //rzutowanie nie jest konieczne
            });
        } catch (ClassCastException e) {
            System.out.println("Przechwycono wyjątek - niezgodność typów");
            String message = e.getMessage();
            System.out.println(message);
        } finally {
            System.out.println("Koniec programu.");
        }
        
    }
    
}
