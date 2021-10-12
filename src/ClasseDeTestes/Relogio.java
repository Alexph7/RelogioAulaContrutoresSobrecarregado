package ClasseDeTestes;

public class Relogio {

    private int hora;
    private int minutos;
    private int segundos;

    public Relogio() {
        this(0, 0, 0);
    }

    public Relogio(int hora, int minutos) {
        this(hora, minutos, 0);
    }

    public Relogio(Relogio r) {
        this(r.getHora(), r.getMinutos(), r.getSegundos());
    }

    public Relogio(int hora) {
        this(hora, 0, 0);
    }

    public Relogio(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Relogio: " + hora + " Horas " + minutos + " Minutos " + segundos + " Segundos";
    }

}
