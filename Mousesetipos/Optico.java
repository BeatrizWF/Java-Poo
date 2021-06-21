package Mousesetipos;

public class Optico extends Mouse {
    boolean cabo = false;
    public Optico(){
        System.out.println("Criei um mouse optico.");
        
    }
    public void mudardpi(){
        System.out.println("\nMudou DPI");
    }      
    public void infoptico(){
        System.out.println(cabo);
    }
}