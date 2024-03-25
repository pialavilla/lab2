package ReservaDeVuelo;

public class Pasajero {
    private String nombre;
    private int dni;
    private Reserva reserva;

    public Pasajero() {
    }

    public Pasajero(String nombre,int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void asignarReserva(Reserva reserva){
        this.reserva=reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
