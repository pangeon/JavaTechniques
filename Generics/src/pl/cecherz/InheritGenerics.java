
package pl.cecherz;

import java.util.ArrayList;

public class InheritGenerics {

    public static void main(String[] args) {
        Number number = 3.08d; //przyjmuje dowolny typ liczbowy, opakuje je wszystkie
        Integer integer = 5;
        Float floAt = 0f;
        System.out.println("");
        System.out.println(number.getClass());
        System.out.println(integer.getClass());
        System.out.println(floAt.getClass());
        System.out.println("");
        number = integer;
        number = floAt;
        
        System.out.println(number.getClass());
        System.out.println(integer.getClass());
        System.out.println(floAt.getClass());
  
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Float> list_2 = new ArrayList<>();
        ArrayList<Number> list_2a = new ArrayList<>();
        ArrayList list_3 = new ArrayList();
        ArrayList list_4 = list_3;
        
        list_1.add(6);
        list_2a.add(4.8);
        list_2a.addAll(list_1);
        
        System.out.println("");
        System.out.println(list_1);
        System.out.println(list_2);
        System.out.println(list_2a);
        System.out.println(list_3);
        System.out.println(list_4);
        // list_1 = list_2; operacja niemożliwa
        //list_2a = list_2; operacja niemożliwa mimo iż Number opakowuje Integer i Float
    }
    
}
