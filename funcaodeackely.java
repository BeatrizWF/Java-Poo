import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double x = 0.0;
    double y = 0.0;
    System.out.println("|----------------------|");
    System.out.println("|   Função De Ackley   |");
    System.out.println("|----------------------|");

        do{
          System.out.println("Informe o valor de x [-32,32]:");
          x = leitor.nextDouble();
          if( !(x >= -32 && x <= 32)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(x >= -32 && x <= 32 ));


        do{
          System.out.println("Informe o valor de y [-32,32]:");
          y = leitor.nextDouble();
          if( !(y >= -32 && y <= 32)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(y >= -32 && y <= 32 ));

        
      //Calculo da função de Ackley
            double c1 = -200 * (Math.pow (Math.E, ( -0.2 * Math.sqrt(( x * x ) + ( y * y )) ) ) );
            double resultado = c1;
            System.out.println("|----------------------|");
            System.out.println("|       Resultado:     |");
            System.out.println("|----------------------|");
            System.out.println (" f(x,y) = " + resultado);
          }
}