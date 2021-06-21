package Mousesetipos;

public class Bluetooth extends Mouse {
    int versaousb;
    int versaobluetooth;
    int distanciausavel;
    int tempobateria;

    public Bluetooth(){
        System.out.println("Criei um mouse bluetooth.");
    }
    public void conectardispositivo(){
        System.out.println("\nConectou-se ao dispositivo.");
    }      
    public void infbluetooth(int versaousb, int versaobluetooth, int distanciausavel, int tempobateria) {
        this.versaousb += versaousb;
        this.versaobluetooth += versaobluetooth ;
        this.distanciausavel += distanciausavel;
        this.tempobateria += tempobateria;
    }
    public void statusbluetooth(){
        System.out.println("Versão USB: " + versaousb + " Versão Bluetooth: " + versaobluetooth + " Distância Usável (m): " + distanciausavel + " Tempo De Bateria(h): " + tempobateria);
      }
}
