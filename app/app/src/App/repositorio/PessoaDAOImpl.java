
package App.repositorio;
import App.entidade.Pessoa;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class PessoaDAOImpl implements PessoaDAO {
        final Map<Integer, Pessoa> dados = new HashMap<>();

        @Override
        public void adicionar(Pessoa pessoa) {
            dados.put(pessoa.getId(), pessoa);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        dados.replace(pessoa.getId(), pessoa);
    }

    @Override
    public void deletarPeloId(int id) {
        dados.remove(id);
    }

    @Override
    public Pessoa obterPeloId(int id) {
        return dados.get(id);
    }

    @Override
    public Map<Integer, Pessoa> obterTodos() {
        dados.forEach((chave, pessoa) -> {
            int id = pessoa.getId();
            String nome = pessoa.getNome();
            String sobrenome = pessoa.getSobrenome();
            System.out.println("Pessoa_id = " + chave + " ----- Pessoa_nome = " + nome + " ----- Pessoa_sobrenome = " + sobrenome);
	});
            System.out.println();
        return dados;
    }
    
}
