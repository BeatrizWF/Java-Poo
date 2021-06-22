package Mousesetipos;
public class Mouse {
    public String modelo =  "";
    public String cor = "" ; 
    public int versao;
    public int dpi;
    public float largura;
    public float altura;
    public boolean botoesadicionais;
    public boolean led;
    public boolean laser;
    public boolean ligar;
      
    public Mouse(){
        System.out.println("Construtor da classe Mouse.");
    }
    public void status(){
      System.out.print("Modelo: " + modelo + " -- Cor: " + cor + " -- Versão: " + versao + " -- DPI máx: " + dpi + " -- Largura: " + largura + " -- Altura: " + altura);
      if (botoesadicionais==true){
          System.out.print(" - Com Botões adicionais ");
      }
      if(led == true){
          System.out.print(" - Led ");
      }
      if (laser == true){
          System.out.print(" - Laser ");
      }
    }
    public void infmouse(String modelo, String cor, int versao, int dpi, float largura, float altura, boolean botoesadicionais, boolean led, boolean laser) {
        this.laser = laser;
        this.led = led;
        this.botoesadicionais = botoesadicionais;
        this.altura += altura;
        this.largura += largura;
        this.dpi += dpi;
        this.versao += versao;
        this.cor += cor;                 
        this.modelo += modelo;
    }
   
    public void ligar(){
        if (ligar == false){
            System.out.println("Mouse.ligar - mouse ligado");
            ligar = true;
        }else{
            System.out.println("\nMouse.ligar - mouse já está ligado.");
        }
    }
    public void desligar(){
        if (ligar == true){
            System.out.println("Mouse.desligar - mouse desligado");
            ligar = false;
        }else{
            System.out.println("\nMouse.desligar - mouse já está desligado.");
        }
    }
    public void clique(){
        if (ligar == true){
            System.out.println("Mouse.clique - cliquei");
        }
    }
    public void scroll(){
        if (ligar == true){
            System.out.println("Mouse.scroll - rolando scroll");
        }
    }

}
