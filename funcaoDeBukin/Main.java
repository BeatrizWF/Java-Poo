import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double x = 0.0;
    double y = 0.0;
    System.out.println("|----------------------|");
    System.out.println("|    Função De Bukin   |");
    System.out.println("|----------------------|");

        do{
          System.out.println("Informe o valor de x [-15,-5]:");
          x = leitor.nextDouble();
          if( !(x >= -15 && x <= - 5)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(x >= -15 && x <= -5 ));


        do{
          System.out.println("Informe o valor de y [-3,3]:");
          y = leitor.nextDouble();
          if( !(y >= -3 && y <= 3)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(y >= -3 && y <= 3 ));

        
    //Calculo da função de Bukin
            double c1 = 100*Math.sqrt(Math.abs(y - 0.01 * (x * x) ));
            double c2 = 0.01 * Math.abs(x + 10.0);
            double resultado = c1 + c2;
            System.out.println("|----------------------|");
            System.out.println("|       Resultado:     |");
            System.out.println("|----------------------|");
            System.out.println(" f(x, y) = " + resultado );
            }
}
