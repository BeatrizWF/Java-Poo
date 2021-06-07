package relogiopoojava;
public class Hora extends Object {
    private int milisegundos = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private int dia = 1;
    private boolean diaSeguinte = false;

    private int[] formatador() {
        int[] horariotempo = new int[4];
        // Essa variável guarda os horários em um array
        while (milisegundos>=1000 || segundos>=60 || minutos>= 60 || horas>=24){
            if (milisegundos >=1000){
                milisegundos = milisegundos - 1000;
                segundos+=1;
            }
            if (segundos >= 60){
                segundos = segundos - 60;
                minutos+=1;
            }
            if (minutos >= 60){
                minutos = minutos - 60;
                horas +=1;
            }
            if (horas>=24){
                horas = horas - 24;
                diaSeguinte = true;
                dia ++;
            }
        }
        horariotempo[0] = horas;
        horariotempo[1] = minutos;
        horariotempo[2] = segundos;
        horariotempo[3] = milisegundos;
        return horariotempo;
    }
    public String getHorario() {
        String horario = "";
        for(int i = 0; i < formatador().length; i ++) {
            if(i < formatador().length - 1) {
                if(formatador()[i] < 10) {
                    horario += "0";
                }
                horario += formatador()[i] + ":";
            } else {
                if(formatador()[i] < 10) {
                    horario += "000";
                } else if (formatador()[i] < 100) {
                    horario += "00";
                } else if(formatador()[i] < 1000) {
                    horario += "0";
                }
                horario += formatador()[i];
            }
        }
        if(diaSeguinte) {
            horario = "Dia " + dia + ". Horário: " + horario;
        }
        System.out.println(horario);
        return horario;
    }
    public void addHorario(int horas, int minutos, int segundos, int milisegundos) {
        this.milisegundos += milisegundos;
        this.segundos += segundos;
        this.minutos += minutos;
        this.horas += horas;
        this.formatador();
    }
    public void dimHorario(int horas, int minutos, int segundos, int milisegundos) {
        this.milisegundos -= milisegundos;
        this.segundos -= segundos;
        this.minutos -= minutos;
        this.horas -= horas;
        this.formatador();
    }
    public String getHorarioAmPm() {
        String horarioAmPm = "";
        if(formatador()[0] > 12) {
            horarioAmPm += (formatador()[0] - 12);
            System.out.print(horarioAmPm + ":");
            String horario = "";
                for(int i = 1; i < formatador().length; i ++) {
                    if(i < formatador().length - 1) {
                        if(formatador()[i] < 10) {
                            horario += "0";
                        }
                        horario += formatador()[i] + ":";
                    } else {
                        if(formatador()[i] < 10) {
                            horario += "000";
                        } else if (formatador()[i] < 100) {
                            horario += "00";
                        } else if(formatador()[i] < 1000) {
                            horario += "0";
                        }
                        horario += formatador()[i];
                    }
                }
                System.out.println(horario + " Pm.");
                return horario;
            }else{
                horarioAmPm += (formatador()[0]);
                System.out.print(horarioAmPm + ":");
                String horario = "";
                    for(int i = 1; i < formatador().length; i ++) {
                        if(i < formatador().length - 1) {
                            if(formatador()[i] < 10) {
                                horario += "0";
                            }
                            horario += formatador()[i] + ":";
                        } else {
                            if(formatador()[i] < 10) {
                                horario += "000";
                            } else if (formatador()[i] < 100) {
                                horario += "00";
                            } else if(formatador()[i] < 1000) {
                                horario += "0";
                            }
                            horario += formatador()[i];
                        }
                    }
                    System.out.println(horario + " Am.");
                    return horario;
        }
    }
    public void delHorario() {
        this.milisegundos = 0;
        this.segundos = 0;
        this.minutos = 0;
        this.horas = 0;
        this.dia = 0;
        this.diaSeguinte = false;
    }
    public long transfMilisegundos() {
        int transfHoras = this.horas;
        int transfMinutos = this.minutos;
        int transfSegundos = this.segundos;
        int transfMilisegundos = this.milisegundos;
        transfMinutos += transfHoras * 60;
        transfSegundos += transfMinutos * 60;
        transfMilisegundos += transfSegundos * 1000L;
        System.out.print(horas+" Horas, "+minutos+" Minutos, "+segundos+" Segundos e "+milisegundos+ " milisegundos são equivalentes ao total de " +transfMilisegundos+ " milisegundos. \n");
        return transfMilisegundos;
    }
    @Override
    public boolean equals(Object b) {
        System.out.println(getHorario().equals(((Hora)b).getHorario()));
        return this.getHorario().equals(((Hora)b).getHorario());
        // Caso o valor do getHorario() de uma instância de Hora seja equivalente ao valor do getHorario() de outra
        // instância de hora, o resultado será positivo
    }
}