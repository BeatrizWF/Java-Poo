import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double x = 0.0;
    double y = 0.0;
    double z = 0.0;
    System.out.println("|----------------------|");
    System.out.println("|    Função De Wolfe   |");
    System.out.println("|----------------------|");
    
        do{
          System.out.println("Informe o valor de x [0,2]:");
          x = leitor.nextDouble();
          if( !(x >= 0 && x <= 2)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(x >= 0 && x <= 2 ));


        do{
          System.out.println("Informe o valor de y [0,2]:");
          y = leitor.nextDouble();
          if( !(y >= 0 && y <= 2)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(y >= 0 && y <= 2 ));

        do{
          System.out.println("Informe o valor de z [0,2]:");
          z = leitor.nextDouble();
          if( !(z >= 0 && z <= 2)){
            System.out.println("Valor fora do limite.");
          }
        }while(!(z >= 0 && z <= 2 ));


          //Calculo da função de Wolfe
            double c1 = 4.0/3.0 * Math.pow( ( x * x ) + ( y * y ) - ( x * y ), 0.75) + z;
            System.out.println("|----------------------|");
            System.out.println("|       Resultado:     |");
            System.out.println("|----------------------|");
            System.out.println(" f(x,y,z) = " + c1);
          }
}