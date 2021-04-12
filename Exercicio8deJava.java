import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    boolean certo = false;
    int tentativas = 3;
    int contDletras = 0;
    char asterisco = '*';
    String palavra ="";
    System.out.println("|-----------------------------|");
    System.out.println ("|        Jogo da Forca        |");
    System.out.println("|-----------------------------|");
    System.out.println(" Qual vai ser a palavra chave?");
    String palavradesejada = leitor.nextLine();
    while (contDletras < palavradesejada.length()){
      palavra = palavra + asterisco;
      contDletras ++;
    }
    while (true){
      System.out.println("\n Palavra secreta é: "+ palavra + "  E ela contém " + palavradesejada.length() + " letras.");
      System.out.println("\n Você tem " + tentativas + " tentativas disponíveis para acertar.\n");
      System.out.println(" Digite uma letra:");
      String letra = leitor.nextLine();
      certo = palavradesejada.contains(letra);
      if (certo){
        System.out.println("\n Você acertou! :)");
        System.out.println("___________________________________________________");
        int nletra = palavradesejada.indexOf(letra);
        while (nletra >= 0){
          palavra = palavra.substring(0, nletra) + letra + palavra.substring( nletra + 1);
          nletra = palavradesejada.indexOf(letra, nletra + 1);
        }
        if (!palavra.contains("*")){
          System.out.println("Aee! Você acertou, parabéns :) A Palavra secreta é: "+palavradesejada);
          System.out.println("___________________________________________________");
          break;
        }
      }else{
        tentativas--;
        if (tentativas > 0){
          System.out.println("\n Aah, você errou! :( Tente de novo.");
          System.out.println("___________________________________________________");
        }
        if (tentativas == 0){
          System.out.println("\n Aah, você perdeu! :( A Palavra secreta era: " + palavradesejada);
          System.out.println("___________________________________________________");
          break;
        }
      }
    }
  }
}

