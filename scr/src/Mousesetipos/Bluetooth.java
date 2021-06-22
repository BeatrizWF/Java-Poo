package Mousesetipos;

public class Bluetooth extends Mouse implements Comercio {
    int versaousb;
    int versaobluetooth;
    int distanciausavel;
    int tempobateria;

    public Bluetooth(){
        System.out.println("Agora tenho um mouse bluetooth.");
    }

    public void conectardispositivo(){
        System.out.println("Conectou-se ao dispositivo.");
    }      

    public void infbluetooth(int versaousb, int versaobluetooth, int distanciausavel, int tempobateria ) {
        this.versaousb += versaousb;
        this.versaobluetooth += versaobluetooth ;
        this.distanciausavel += distanciausavel;
        this.tempobateria += tempobateria;
    }
    public void statusbluetooth(){
        status();
        System.out.println("\nVersão USB: " + versaousb + " -- Versão Bluetooth: " + versaobluetooth + 
                " -- Distância Usável (m): " + distanciausavel + " -- Tempo De Bateria(h): " + tempobateria + " -- Valor médio:" + this.valormedio);
      }
}
