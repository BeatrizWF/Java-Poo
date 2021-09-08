
package projetoplataformastream;

import projetoplataformastream.entidade.Person;


public class Viewers extends Person {
    private String login;
    private int watchtime;

    public Viewers(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.watchtime = 0;
    }

    
    
    
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getWatchtime() {
        return watchtime;
    }

    public void setWatchtime(int watchtime) {
        this.watchtime = watchtime;
    }

    @Override
    public String toString() {
        return "Viewer -> " + super.toString() + "  { login = " + login + " , watchtime = " + watchtime + " }";
    }
    
    
    
    
}
