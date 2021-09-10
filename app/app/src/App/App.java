package App;

import App.entidade.Pessoa;
import App.repositorio.PessoaDAOImpl;

public class App {

    public static void main(String[] args) {
        executar();
    }
        public static void executar() {
        
        Pessoa pessoa01 = new Pessoa(1, "Veronica", "Roecker");
        Pessoa pessoa02 = new Pessoa(2, "José", "Warmeling");
        Pessoa pessoa03 = new Pessoa(3, "João", "Correa");
        PessoaDAOImpl pessoaDAOImpl = new PessoaDAOImpl();
        pessoaDAOImpl.adicionar(pessoa01);
	pessoaDAOImpl.adicionar(pessoa02);
        Pessoa idPessoa = pessoaDAOImpl.obterPeloId(pessoa01.getId());
	System.out.println("Buscando nome pelo Id : " + idPessoa.getNome() + " " + idPessoa.getSobrenome());
        
	pessoa01.setSobrenome("Warmeling");
        System.out.println("Buscando novo nome pelo Id : " + idPessoa.getNome() + " " + idPessoa.getSobrenome());
	pessoaDAOImpl.atualizar(pessoa01);
	pessoaDAOImpl.obterTodos();
        
        pessoaDAOImpl.deletarPeloId(pessoa03.getId());
    }
    
}
