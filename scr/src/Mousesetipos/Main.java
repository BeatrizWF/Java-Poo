package Mousesetipos;
public class Main {
    public static void main(String[] args) {
        
        // ligar desligar clique scroll -> mouse 
        // tipos(bluetooth ou optico ou wireless) e interface comercio.
        // metodo infmouse para colocar atributos fundamentais base de todo mouse
        // cor  versão  DPI  largura  altura  botoes adicionais  led  laser ;
        // metodo inf -> para colocar necessidade de atributos de cada tipo
        // infoptico infbluetooth infwireless 
        // statusoptico statusbluetooth statuswireless 
        Bluetooth mousezim = new Bluetooth();
        mousezim.infmouse("aa", "amarelo", 2, 300, 22, 30, true, true, false);
        // valor medio interface comercio aplicada em status
        mousezim.infbluetooth(3, 2, 5, 10);
        mousezim.statusbluetooth();
        
        mousezim.ligar();
        mousezim.clique();
        mousezim.scroll();
        mousezim.desligar();
    }    
}
