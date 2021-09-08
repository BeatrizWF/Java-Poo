
package projetoplataformastream;

public class ProjetoPlataformaStream {

    public static void main(String[] args) {
        Stream frontpage[] = new Stream[2];
        frontpage[0] = new Stream("Aprendendo Poo");
        
        
        System.out.println(frontpage[0]);
        
        
        Viewers jose = new Viewers("jose", 108 ,"M", "loginjosezim");
        
        System.out.println(jose);
        
    }
    
}
