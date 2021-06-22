package Mousesetipos;

public class Optico extends Mouse implements Comercio  {
    boolean cabo = false;
    public Optico(){
        System.out.println("Agora tenho um mouse optico.");
        
    }
    public void mudardpi(){
        System.out.println("\nMudou DPI");
    }      
    public void infoptico(boolean cabo){
        this.cabo = cabo;
    }
    public void statusoptico(){
        status();
        System.out.println("Cabo: "+ cabo + " -- Valor médio:" + this.valormedio);
    }
}