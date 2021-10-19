package conjuntospoojava;
import java.util.HashSet;

public class Conjuntos {
	private HashSet<String> conjuntoA;
	private HashSet<String> conjuntoB;
	private HashSet<String> uniao;
	private HashSet<String> interseccao;
	private HashSet<String> diferenca;
	private HashSet<String> complementar;


	public Conjuntos() {
		this.conjuntoA = new HashSet<String>();
		this.conjuntoB = new HashSet<String>();
		this.uniao = new HashSet<String>();
		this.interseccao = new HashSet<String>();
		this.diferenca = new HashSet<String>();
		this.complementar = new HashSet<String>();

	}

	public void criarConjunto(String conjunto, int tipo) {
		String[] elemento = conjunto.split(" ");
		int tamanho = elemento.length;

		for (int i = 0; i < tamanho; i++) {
			if (tipo == 1) {
				if(!elemento[i].isEmpty())
					conjuntoA.add(elemento[i]);
			} else {
				if(!elemento[i].isEmpty())
					conjuntoB.add(elemento[i]);
			}
		}
	}

	public void Uniao() {
		uniao.addAll(conjuntoA);
		uniao.addAll(conjuntoB);
	}

	public void Interseccao() {
            conjuntoA.stream().filter((a) -> (conjuntoB.contains(a))).forEachOrdered((a) -> {
                interseccao.add(a);
            });
	}

	public void Diferenca() {
            conjuntoA.stream().filter((a) -> (!conjuntoB.contains(a))).forEachOrdered((a) -> {
                diferenca.add(a);
            });
	}
        
        public void Complementar() {	
            uniao.removeAll(conjuntoB);
            complementar.addAll(uniao);
	}
            
            
	public HashSet<String> getConjuntoA() {
		return conjuntoA;
	}

	public HashSet<String> getConjuntoB() {
		return conjuntoB;
	}

	public HashSet<String> getUniao() {
		return uniao;
	}

	public HashSet<String> getInterseccao() {
		return interseccao;
	}

	public HashSet<String> getDiferenca() {
		return diferenca;
	}

	public HashSet<String> getComplementar() {
		return complementar;
	}

}
