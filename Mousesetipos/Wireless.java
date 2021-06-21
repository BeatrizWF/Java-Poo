package Mousesetipos;

public class Wireless extends Mouse {
    int distanciausavel;
    int tempobateria;
    public Wireless(){
        System.out.println("Criei um mouse wireless.");
    }
    public void conectardispositivo(){
        System.out.println("\nConectou-se ao dispositivo.");
    }  
    public void infwireless( int distanciausavel, int tempobateria) {
        this.distanciausavel += distanciausavel;
        this.tempobateria += tempobateria;
    }
    public void statuswireless(){
        System.out.println("Distância Usável (m): " + distanciausavel + " Tempo De Bateria (h): " + tempobateria);
    }
}