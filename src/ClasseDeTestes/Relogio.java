package ClasseDeTestes;

public class Relogio {

    private int hora; //Entre 0-24
    private int minutos; //Entre 0-59
    private int segundos; //Entre 0-59

    //Construtor Sem Parametros
    //Inicializa para 0 cada Variavel de instancia
    public Relogio() {
        this(0, 0, 0); // Invoca o Construtor Com 3 Argumentos
    }

    //Construtor Com 1 Parametro
    //Hora Fornecida e Minutos e segundos inicializados para 0
    public Relogio(int hora) {
        this(hora, 0, 0); // Invoca o Construtor Com 3 Argumentos
    }

    // Construtor Com 2 Parametros
    //Hora e Minutos Fornecidos e segundos Inicializado para 0
    public Relogio(int hora, int minutos) {
        this(hora, minutos, 0); // Invoca o Construtor Com 3 Argumentos
    }

    //Construtor Com 3 Parametros
    public Relogio(int hora, int minutos, int segundos) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("Hora Deve Ser Entre 0 - 23");
        }
        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Minutos Deve Ser Entre 0 - 59");
        }
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Segundos Deve Ser Entre 0 - 59");
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //Contrutor com objeto Relogio Fornecido
    public Relogio(Relogio r) {
        this(r.getHora(), r.getMinutos(), r.getSegundos()); // Invoca o Construtor Com 3 Argumentos
    }

    public int getHora() {
        return hora;
    }

    //Valida e Configura a Hora
    public void setHora(int hora) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("Hora Deve Ser Entre 0 - 23");
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    //Valida e configura os Minutos
    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Minutos Deve Ser Entre 0 - 59");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //Valida e configura os Segundos
    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Segundos Deve Ser Entre 0 - 59");
        }
        this.segundos = segundos;
    }

    public String toString() {
        return String.format("%d:%02d:%02d", getHora(), getMinutos(), getSegundos());
    }

    public String horaUniversal() {
        return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinutos(), getSegundos(), (getHora() < 12 ? "AM" : "PM"));
    }
}
