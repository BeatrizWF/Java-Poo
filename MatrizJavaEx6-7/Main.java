import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int i, j;
      int matA[][];
      int matB[][];
      int linhaA=0, colunaA =0;
      int linhaB=0, colunaB =0;
      System.out.println("\n------------------------------------");
      System.out.println("| Multiplicando matrizes quadradas |");
      System.out.println("------------------------------------\n");
      // Matriz A
      System.out.println("             MATRIZ 1            ");
      System.out.print("Informe a quantidade de linhas da 1ª matriz: ");
        linhaA = input.nextInt();
      System.out.print("Informe a quantidade de colunas da 1ª matriz: ");
        colunaA = input.nextInt();
      matA= new int [linhaA][colunaA];
      // Obtem valores de posições:
      for (i=0; i<linhaA; i++) {
        for (j=0; j<colunaA; j++) {
          System.out.print("\nDigite o valor da posição correspondente a Linha " + i + " Coluna " + j +" da 1ª matriz: ");
          matA[i][j] = input.nextInt();
        }
      }
     // Matriz B
      System.out.println("\n              MATRIZ 2             ");
      System.out.print("Informe a quantidade de linhas da 2ª matriz: ");
        linhaB = input.nextInt();
      System.out.print("Informe a quantidade de colunas da 2ª matriz: ");
        colunaB = input.nextInt();
      matB= new int [linhaB][colunaB];
      // Obtem valores de posições:
      for (i=0; i<linhaB; i++) {
        for (j=0; j<colunaB; j++) {
          System.out.print("\nDigite o valor da posição correspondente a Linha " + i + " Coluna " + j +" da 2ª matriz: ");
          matB[i][j] = input.nextInt();
        }
      }
      // Multiplicando linhaxColuna AxB
        int c[][] = new int [linhaA][colunaB];
        for(i = 0; i < linhaA; i++){
          for(j = 0; j < colunaB; j++){
            int total = 0;
            for(int k = 0; k < linhaB; k++){
              int m = matA[i][k];
              int n = matB[k][j];
              total = total + m * n;
            }
            c[i][j] = total;
          }
        }
      // Mostra resultado da multiplicação
      System.out.println("\nResultado AxB:\n");
      for (i=0; i<linhaA; i++) {
        for (j=0; j<colunaB; j++) {
          System.out.print("["+c[i][j]+"]");
        }
        System.out.println();
      }
  }
}
