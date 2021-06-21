package Mousesetipos;
public class Main {
    public static void main(String[] args) {
        //Optico mousezim = new Optico();
        //Bluetooth mousezim = new Bluetooth();
        Wireless mousezim = new Wireless();
        mousezim.infmouse("aa", "amarelo", 2, 300, 22, 30, true, true, false);
        mousezim.status();
        mousezim.ligar();
        mousezim.infwireless(5, 2);
        mousezim.statuswireless();
    }    
}
