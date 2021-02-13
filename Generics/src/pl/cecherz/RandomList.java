
package pl.cecherz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//interfejs Comparable oczekuje typu T lub dowolnego typu nadrzędnego
public class RandomList<T extends Comparable<? super T>> {
    // przekazany typ danych do listy jest dowolny
    private ArrayList<T> list = new ArrayList<>();
    private Random rand = new Random();
    
    public T getRandomList() {
        int rand_int = rand.nextInt(list.size());
        System.out.println("Wykonanie metody get: " + list.get(rand_int));
        return list.get(rand.nextInt(list.size()));
    }

    public ArrayList<T> getNormalList() {
        System.out.println(list);
        return list;
    }
    
    public void add(T element) {
        list.add(element);
    }
    public void sort() {
        Collections.sort(list); // klasa musi gwarantować, że elementy będą
        // przesortowane, typ musi dziedzić po Comparable
        System.out.println("Przesortowana lista: " + list);
    }
    
    
}
