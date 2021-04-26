import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i, j, k, l;
    int mat[][];
    int matrotacionada[][];
    int matrotacionadaxx[][];
    int grau;
    int linha=0, coluna=0;
    System.out.print("\n-----------------------------------------------");
    System.out.print("\n| Rotacionando matriz quadrada em graus retos |");
    System.out.print("\n|          0º  90º  180º  270º  360º          |");
    System.out.print("\n-----------------------------------------------");
    System.out.print("\nInforme a quantidade de linhas da matriz: ");
      linha = input.nextInt();
    System.out.print("Informe a quantidade de colunas da matriz: ");
      coluna = input.nextInt();
    mat= new int [linha][coluna];
    matrotacionada=new int[linha][coluna];
    System.out.println();
    for (i=0; i<linha; i++) {
        for (j=0; j<coluna; j++) {
          System.out.print("Digite o valor da posição correspondente a Linha " + (i+1) + " Coluna " + (j+1) +" da matriz: ");
          mat[i][j] = input.nextInt();
        }
      }
      System.out.print("\nInforme qual é o grau que deseja rotacionar a matriz: ");
        grau = input.nextInt();
        if (grau==0){
          System.out.println("\nMatriz em 0º:\n");
          for (i=0; i<linha; i++) {
            for (j=0; j<coluna; j++) {
              System.out.print("["+mat[i][j]+"]");
            }
            System.out.println();
            }
        }
        else if (grau == 90){
          System.out.println("\nMatriz em 90º:\n");
          for (i=0; i<linha; i++) {
            for (j= 0; j<coluna; j++) {
              matrotacionada[j][i] = mat[linha-1-i][j];
              
            }
          }
        }
        else if (grau == 180){
          matrotacionadaxx= new int [linha][coluna];
          System.out.println("\nMatriz em 180º:\n");
          for (i=0; i<linha; i++) {
            for (j= 0; j<coluna; j++) {
            matrotacionada[j][i] = mat[linha-1-i][j];
            }
          }
          for (l=0; l<linha; l++) {
            for (k= 0; k<coluna; k++) {
              matrotacionadaxx[l][k] = matrotacionada[linha-1-k][l];
              System.out.print("["+ matrotacionadaxx[l][k]+"]");
            }
            System.out.println();
          }
        }
        else if (grau == 270){
          System.out.println("\nMatriz em 270º:\n");
          for (i=0; i<linha; i++) {
            for (j=0; j<coluna; j++) {
              matrotacionada[j][i] = mat[i][linha-1-j];
            }
          }
        }
        else if (grau == 360){
          System.out.println("\nMatriz em 360º:\n");
          for (j=0; j<coluna; j++) {
            for (i=0; i<linha; i++) {
              System.out.print("["+mat[j][i]+"]");
            }
            System.out.println();
          }
        }
        else{
          System.out.println("\nErro ao informar o grau desejado, tente novamente. Lembre-se de usar graus retos, como:  0  90  180  270  360 ");
        }
        if (grau==90 || grau==270 ){
          for (i=0; i<linha; i++) {
            for (j=0; j<coluna; j++) {
            System.out.print("["+ matrotacionada[i][j]+"]");
            }
            System.out.println();
          }
        }
  }
}