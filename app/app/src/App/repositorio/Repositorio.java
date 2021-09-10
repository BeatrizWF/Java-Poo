
package App.repositorio;

public class Repositorio {
    
    final static Repositorio instancia = new Repositorio();    
    private final PessoaDAO pessoaDAO = new PessoaDAOImpl();
    private Repositorio() {
    }
    public static Repositorio obterInstancia(){
        return instancia;
    }
    
    public PessoaDAO pessoas(){
        return pessoaDAO;
    }

    
}
