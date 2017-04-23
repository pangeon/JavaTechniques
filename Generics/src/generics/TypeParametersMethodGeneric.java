
package generics;
import java.awt.Color;
import static java.lang.Double.NaN;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class TypeParametersMethodGeneric {
    // dodaje dowolne liczby z ograniczeniem tylko do liczb
    public static <T extends Number> double SumExtendsReturn(List<T> sum) { 
        double start = 0;
        sum.size();
        for (int element = 0; element < sum.size(); element++) { 
            start += sum.get(element).intValue(); // nie ważne na jakich
            // wartościach operuje zwróci double, bo tak podaje w deklaracji metody
            System.out.println(start);
            
        }
        return start; // zwracam double
    }
    public static<X> void reverse(List<X> arg) { //etykieta typu jest dowolna
        for (int i = 0; i < arg.size() /2; i++) {
            X element = arg.get(i);
            
            arg.set(i, arg.get(arg.size() - i - 1));
            arg.set((arg.size() - i - 1), element);
        }
    }
    // korzystam z parametru typu, mogę podać dowolny typ danych
    public static<T> void display(T arg) {
        System.out.println(arg);     
    }
    // w tym wypadku również mogę dodać dowolny typ danych
    public static Object displayObject(Object arg) {
        return arg;   
    }
    public static void Sum(List<Integer> sum) { // jak przeiterować zbiór liczb np. typu double?
        int start = 0;
        for (int element : sum) { //interator musi być całkowitą liczbą
            start += element;
        }
        // alternatywnie: 
        // start = sum.stream().map((element) -> element).reduce(start, Integer::sum);
        System.out.println(start);
    }
    public static Double SumReturn(List<Double> sum) { // jak przeiterować zbiór liczb np. typu double?
        double start = 0;
        sum.size();
        for (int element = 0; element < sum.size(); element++) { //interator musi być całkowitą liczbą
            start += sum.get(element);
        }
        return start;
    }
    public static void Medium(List<?> list) {
        double size = (list.size())/2;
        if(size > 0) {
            System.out.println(size);
        } else {
            System.out.println("Podałeś tylko jeden element");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(); //dziedziczy po List
        list.add(6);
        list.add(56);
        list.add(986);
        list.add(-569);
        list.add(16);
        list.add(11);
        list.add(598);
        Sum(list);
        Medium(list);
        reverse(list);
        display(list);
        
        ArrayList<Double> list_2 = new ArrayList();
        // nie mogę użyć wielu typów
        // wildcard nie spełnia zadania
        list_2.add(6d);
        list_2.add(56d);
        // list_2.add(986f); błąd kompilatora
        list_2.add(-569d);
        list_2.add(16d);
        list_2.add(11d);
        list_2.add(598d);
        out.println(SumReturn(list_2));
        out.println(SumExtendsReturn(list_2));
        
        // mogę dodać do listy wszystko
        ArrayList<Object> list_3 = new ArrayList();
        // nie mogę użyć wielu typów
        // wildcard nie spełnia zadania
        Color color = new Color(56, 67, 77);
        list_3.add(6);
        list_3.add(56d);
        list_3.add(986f);
        list_3.add(NaN);
        list_3.add("16d");
        list_3.add(color); // dodałem nawet obiekt Color
        // w tym wypadku nie pełni on żadnej konkretnej funkcji
        list_3.add(null);
        display(list_3);
        
        ArrayList<Number> list_4 = new ArrayList();
       
        list_4.add(6d);
        list_4.add(56);
        list_4.add(986f);
        list_4.add(-569d);
        list_4.add(16.985);
        list_4.add(Math.E);
        list_4.add(Math.PI);
        out.println("TAK: " +SumExtendsReturn(list_4));

    }
    
}
