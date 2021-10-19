package conjuntospoojava;

import java.util.Scanner;

public class ConjuntosPooJava {
	private static String conjunto;
	public static void main(String[] args) {		
		
		Conjuntos conjuntos = new Conjuntos();
                Scanner entrada = new Scanner(System.in);

                
                System.out.println("Observação 1º = Para fazer a operação complementar, B deve estar contido em A");
                System.out.println("Observação 2º = Informe os elementos separando-os com espaços exemplor: 1 2 3 4");
                System.out.println("Informe os elementos do Conjunto A.");
		conjunto =  entrada.nextLine();
		conjuntos.criarConjunto(conjunto, 1);
                
                System.out.println("Informe os elementos do Conjunto B.");
		conjunto =  entrada.nextLine();
		conjuntos.criarConjunto(conjunto, 2);

                System.out.println( "Conjunto A = " + conjuntos.getConjuntoA() + "\n" + "Conjunto B = "	+ conjuntos.getConjuntoB() + "\n");
		conjuntos.Uniao();
		System.out.println("Quantidade de elementos de acordo com as operações:" + "\n \n" + "União A U B = " + conjuntos.getUniao() + "  Quant. elementos: " + conjuntos.getUniao().size() + "\n" );
                conjuntos.Interseccao();
                System.out.println("Intersecção A ^ B = " + conjuntos.getInterseccao() + "  Quant. elementos: " + conjuntos.getInterseccao().size() + "\n");
                conjuntos.Interseccao();
                System.out.println("Diferença A - B = " + conjuntos.getDiferenca() + "  Quant. elementos: " + conjuntos.getDiferenca().size() + "\n");
                conjuntos.Diferenca();
                conjuntos.Complementar();
                System.out.println("Complementar B C A = " + conjuntos.getComplementar() + "  Quant. elementos: " + conjuntos.getComplementar().size() + "\n \n" );
        }	
}
	