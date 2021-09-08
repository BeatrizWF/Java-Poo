package projetoplataformastream;

public class Stream implements IActionsStream{

    private String titulo;
    private int quantviewson;
    private float uptime;
    private boolean playing;
    private int volume;
    private int clipsave;
    
    
    
    /*Timer timer = new Timer();
    
    final long SEGUNDOS = (1000 * 3600);
    
     TimerTask tarefa = new TimerTask (){
        public void run() {
            uptime = uptime++;
            System.out.print(uptime);
        }
    }; */ // tentei colocar timer para aumentar horas em a cada 3600 segundos quando iniciasse metodo play porem nao consegui 
    

    
    
    
    
    
    public Stream(String titulo) {
        this.titulo = titulo;
        this.quantviewson = 0;
        this.uptime = 0;
        this.playing = true;
        this.volume = 5;
        this.clipsave = 0;
    }

    public int getClipsave() {
        return clipsave;
    }

    public void setClipsave(int clipsave) {
        this.clipsave = clipsave;
    }
    
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantviewson() {
        return quantviewson;
    }

    public void setQuantviewson(int quantviewson) {
        this.quantviewson = quantviewson;
    }

    public float getUptime() {
        return uptime;
    }

    public void setUptime(float uptime) {
        this.uptime = uptime;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void play() {
        this.playing = true;
    }
    @Override
    public void pause() {
        this.playing = false;
    }
    @Override
    public void volup() {
        this.volume = volume++ ;
    }
    @Override
    public void voldown() {
    this.volume = volume-- ;
    }
    @Override
    public void cliprecording() {
    this.clipsave = clipsave++;
    } 

    @Override
    public String toString() {
        return "Stream " + titulo + ", está reproduzindo: " + playing +", no volume " + volume +" , com quantidade de views on = " + quantviewson + ", quantidade de horas reproduzindo = " + uptime + " tem quantos clipes feitos: " + clipsave;
    }
 
}
