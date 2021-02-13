
package pl.cecherz;

import java.sql.Date;

public class ClassGenerics<T> {

    public static void main(String[] args) {
        RandomList<Integer> random_list = new RandomList<>();
        random_list.getNormalList(); // pusta lista
        for (int i = 10; i > 0; i--) {
            random_list.add(i); // dodaje 10 kolejnych elementów od 9 do 0
        }
        
        random_list.getNormalList(); // zapełniona lista
        for (int i = 0; i < 10; i++) { 
            random_list.getRandomList(); // [nie wykorzystuje iteratora w pętli]
            // przy każdym obrocie pętli metoda getRandomList() zwraca losowy
            // element listy
        }
        random_list.getNormalList(); // zwraca nie znaczy przestawia
        random_list.sort(); //sortuje liste
        
        RandomList<java.sql.Date> date_list = new RandomList<>();
        // rok dwie ostatnie cyfry, miesiące liczone od zera !
        date_list.add(new Date(86, 1, 15));
        date_list.add(new Date(00, 0, 1));
        date_list.add(new Date(65, 2, 15));
        
        date_list.getNormalList();
        
        // nie implementuje interfejsu Comparable
        // RandomList<java.awt.Color> color_list = new RandomList<>(); 
        
        // nie wiem do czego służy klasa, wiem że implementuje interfejs Comparable
        RandomList<java.security.CryptoPrimitive> crypto_list = new RandomList<>();
        
        // zastasowanie list jak widać jest wszechstronne
        
    }
    
}
