package ReservaDeVuelo;

public class Reserva{
    private int numDeAsiento;
    private Vuelo vuelo;

    public Reserva() {
    }

    public Reserva(int numDeAsiento) {
        this.numDeAsiento = numDeAsiento;
    }
    public void asignarVuelo(Vuelo vuelo){
        this.vuelo = vuelo;
    }

    public int getNumDeAsiento() {
        return numDeAsiento;
    }

    public void setNumDeAsiento(int numDeAsiento) {
        this.numDeAsiento = numDeAsiento;
    }
}
