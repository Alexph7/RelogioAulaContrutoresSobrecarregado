package ClasseDeTestes;

public class Relogio {

    private int hora;
    private int minutos;
    private int segundos;

    public Relogio() {
        this(0, 0, 0);
    }

    public Relogio(int hora) {
        this(hora, 0, 0);
    }

    public Relogio(int hora, int minutos) {
        this(hora, minutos, 0);
    }

    public Relogio(int hora, int minutos, int segundos) {
        if (hora < 0 || hora >=24) {
            throw new IllegalArgumentException("Hora Deve Ser Entre 0 - 23");
        }
        if (minutos < 0 || minutos >=60) {
            throw new IllegalArgumentException("Minutos Deve Ser Entre 0 - 59");
        }
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Segundos Deve Ser Entre 0 - 59");
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Relogio(Relogio r) {
        this(r.getHora(), r.getMinutos(), r.getSegundos());
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
