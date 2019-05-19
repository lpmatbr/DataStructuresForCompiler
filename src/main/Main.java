package main;

import java.util.ArrayList;
import java.util.LinkedList;
import structures.Array.Array;
import structures.Linked.Linked;

/**
 *
 * @author Sávio Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array a = new Array();
        Linked l = new Linked();
        ArrayList a2 = new ArrayList();
        LinkedList l2 = new LinkedList();
        
        int dados = 10000;
        
        long ArrAddTempoInicio = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            a.add(i);
        }
        long ArrAddTempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de add Array: " + (ArrAddTempoFinal - ArrAddTempoInicio));
        
        long LinAddTempoInicio = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            l.add(i);
        }
        long LinAddTempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de add Linked: " + (LinAddTempoFinal - LinAddTempoInicio));
        
        //Get
        long ArrGetTempoInicio = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            a.get(i);
        }
        long ArrGetTempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de get Array: " + (ArrGetTempoFinal - ArrGetTempoInicio));
        
        long LinGetTempoInicio = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            l.get(i);
        }
        long LinGetTempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de get Linked: " + (LinGetTempoFinal - LinGetTempoInicio));
        
        //Estruturas do java
        System.out.println("------------------------------------");
        
        long ArrAddTempoInicio2 = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            a2.add(i);
        }
        long ArrAddTempoFinal2 = System.currentTimeMillis();
        System.out.println("Tempo de add ArrayList: " + (ArrAddTempoFinal2 - ArrAddTempoInicio2));
        
        long LinAddTempoInicio2 = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            l2.add(i);
        }
        long LinAddTempoFinal2 = System.currentTimeMillis();
        System.out.println("Tempo de add LinkedList: " + (LinAddTempoFinal2 - LinAddTempoInicio2));
        
        //Get
        long ArrGetTempoInicio2 = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            a2.get(i);
        }
        long ArrGetTempoFinal2 = System.currentTimeMillis();
        System.out.println("Tempo de get ArrayList: " + (ArrGetTempoFinal2 - ArrGetTempoInicio2));
        
        long LinGetTempoInicio2 = System.currentTimeMillis();
        for (int i = 0; i < dados; i++) {
            l2.get(i);
        }
        long LinGetTempoFinal2 = System.currentTimeMillis();
        System.out.println("Tempo de get LinkedList: " + (LinGetTempoFinal2 - LinGetTempoInicio2));
        
        /*
            Tempo de add Array: 13
            Tempo de add Linked: 50
            Tempo de get Array: 2
            Tempo de get Linked: 272
            ------------------------------------
            Tempo de add ArrayList: 4
            Tempo de add LinkedList: 5
            Tempo de get ArrayList: 13
            Tempo de get LinkedList: 224
        */
        
    }
    
}
