package App.repositorio;

import App.entidade.Pessoa;
import java.util.Map;
import java.util.List;


public interface PessoaDAO {
    void adicionar(Pessoa pessoa);
    void atualizar(Pessoa pessoa);
    void deletarPeloId(int id);
    Pessoa obterPeloId(int id);

    Map<Integer, Pessoa> obterTodos();
    
}
