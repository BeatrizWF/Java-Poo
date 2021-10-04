package App.Gerenciamento;
public class ControleDeAcesso {

    private static ControleDeAcesso controle = null;
    private final GerenciamentoInterface dados = new GerenciamentoClass();
    private ControleDeAcesso(){}

    public static ControleDeAcesso obterControle(){
        if (controle == null){ controle = new ControleDeAcesso(); }
        return controle;
    }
    
    public GerenciamentoInterface crud(){ return dados; }
}
