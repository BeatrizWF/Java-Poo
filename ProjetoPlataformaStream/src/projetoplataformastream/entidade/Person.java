
package projetoplataformastream.entidade;

public abstract class Person {
    protected String nome;
    protected int idade;
    protected String sexo;

    public Person(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa de nome = " + nome + " , idade = " + idade + " , sexo = " + sexo ;
    }
    
}
