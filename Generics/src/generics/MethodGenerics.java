
package generics;

import java.util.ArrayList;

public class MethodGenerics {
    // korzystam z wyrażeń wieloznacznych z ograniczeniem do klas nadrzętnych,
    // w tym wypadku np. Number oraz Object
    public static int SuperSizeWildCards(ArrayList<? super Integer> arg) {
        return arg.size();
    }
    // korzystam z wyrażeń wieloznacznych z ograniczeniem do klas dziedziczących
    // po klasie Number, metoda ma zastosowanie tylko do liczby, ogranicza zaś
    // jej wykonywanie na listach zawierających np. napisy
    public static int ExtendsSizeWildCards(ArrayList<? extends Number> arg) {
        return arg.size();
    }
    public static Number ExtendsGetterSizeWildCards(ArrayList<? extends Number> arg) {
        Number x = arg.get(0); // rzutowanie nie jest potrzebne wiemy że typ ?
        // jest ograniczony klas dziedziczących po number
        return x;
    }
    public static void ExtendsSetterWildCards(ArrayList<? extends Number> arg) {
        arg.add(null); // mogę dodać tylko null
        //arg.add("Bonifacy"); nie mogę zdefiniować dodawania elemntów do listy
        //arg.add(45);
    }
    // korzystam z wyrażeń wieloznacznych, typ przekazany do listy może być dowolny
    public static int SizeWildCards(ArrayList<?> arg) {
        return arg.size();
    }
    public static String GetterWildCards(ArrayList<?> arg, int arg2) {
        String x = (String) arg.get(2); // rzutowanie na typ String
        Object y = (Object) arg.get(0); // rzutowanie na typ ogólny
        if (arg2 == 1) {
            return x; // wiemy że zwraca String
        } else {
            return (String) y; // konkretyzacja zwracanego typu
        }
    }
    public static void SetterWildCards(ArrayList<?> arg) {
        arg.add(null); // mogę dodać tylko null
        //arg.add("Bonifacy"); nie mogę zdefiniować dodawania elemntów do listy
        //arg.add(45);
    }
    public static int SizeNumber(ArrayList<Number> arg) {
        return arg.size();
    }    
    public static int SizeInt(ArrayList<Integer> arg) {
        return arg.size();
    }    
    public static void main(String[] args) {
        //lista pierwsza 
        ArrayList<Integer> lista = new ArrayList();
        lista.add(23);
        lista.add(45);
        lista.add(0);
        int a = SizeInt(lista);
        int c = SizeWildCards(lista);
        int m = ExtendsSizeWildCards(lista);
        Number l = ExtendsGetterSizeWildCards(lista);
        //int b = SizeNumber(lista); Wykonanie instrukcji jest niemożliwe mimo iż
        //typ Number jest nadrzędny wobec Integer
        Number b = a; // ta istrukcja jest poprawna Number opakowuje Integer

        System.out.println(a);
        System.out.println(lista);
        System.out.println("");
        
        //lista druga
        ArrayList<Number> lista_2 = new ArrayList();
        lista_2.add(23f); //typ Float
        lista_2.add(45.3d); // typ Double
        lista_2.add(null); // null
        int d = SizeNumber(lista_2);
        int e = SizeWildCards(lista_2);
        int n = ExtendsSizeWildCards(lista_2);
        Number s = ExtendsGetterSizeWildCards(lista_2);
        // int d = SizeInt(lista_2); wykonanie metody jest niemożliwe
        // mimo iż do listy można dodawać rozmaite typy liczbowe
        
        System.out.println(b);
        System.out.println(lista_2);
        System.out.println("");
        //przypisaliśmy do listy wiele typów
        
        //lista trzecia
        ArrayList<String> lista_3 = new ArrayList(); // lista typu z obiektami typu String
        lista_3.add("Jadwiga");
        lista_3.add("Kamil");
        lista_3.add("Patrycja");
        // lista_3.add(67) mogę dodać tylko napisy !
        // int f = SizeInt(lista_3); określony typ parametrów metody jako Integer
        int g = SizeWildCards(lista_3); // brak określonego typu parametrów metody
        // int h = SizeNumber(lista_3); określony typ parametrów metody jako Number
        String h = GetterWildCards(lista_3, 1); // metoda zwracająca trzeci element list
        SetterWildCards(lista_3); // dodaje pustą referencje
        //int o = ExtendsSizeWildCards(lista_3); wykonie metody jest niemożliwe, klasa
        //String jest niezależna od klasy number
        //Number x = ExtendsGetterSizeWildCards(lista_3); wykonie niemożliwe
        System.out.println(g);
        System.out.println(lista_3);
        System.out.println(h); 
        System.out.println("");
    }
    
}
