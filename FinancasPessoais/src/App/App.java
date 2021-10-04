package App;
import App.Gerenciamento.ControleDeAcesso;

import java.util.Scanner;
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App.executar();
    }
    public static void executar(){
        double addGasto;
        double addGanho ;
        Scanner leitor = new Scanner(System.in);
        while (true){
            /* Inicia aplicativo e escolhe a opção */
            System.out.println();
            System.out.println(" ------  Finanças Pessoais  ------ ");
            System.out.println(" | Digite 1 para Adicionar Gasto | ");
            System.out.println(" | Digite 2 para Adicionar Ganho | ");
            System.out.println(" | Digite 3 para Calcular valor  | ");
            System.out.println(" | Digite 0 para Finalizar/Sair  | ");
            System.out.println(" --------------------------------- ");
            int index = leitor.nextInt();
            /* Le a opção */
            if (index == 1){
                System.out.print(" Digite o valor do Gasto:");
                addGasto = leitor.nextDouble();
                ControleDeAcesso.obterControle().crud().adicionarGasto(addGasto);
            }
            if (index == 2){
                System.out.print(" Digite a Entrada:");
                addGanho = leitor.nextDouble();
                ControleDeAcesso.obterControle().crud().adicionarGanho(addGanho);
            }
            if (index == 3){
                ControleDeAcesso.obterControle().crud().somar();
            }
            if (index == 0){
                System.out.println(" ------  Finanças Pessoais  ------ ");
                System.out.println(" |                               | ");
                System.out.println(" |  O Programa Foi finalizado !  | ");
                System.out.println(" |                               | ");
                System.out.println(" --------------------------------- ");
                break;
            }
        }
    }
}
