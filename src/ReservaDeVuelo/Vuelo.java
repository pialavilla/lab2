package ReservaDeVuelo;

public class Vuelo {
    private int capacidad;
    private int numVuelo;

    public Vuelo() {
    }

    public Vuelo(int capacidad,int numVuelo) {
        this.capacidad = capacidad;
        this.numVuelo = numVuelo;
    }
    public void numVuelo(){
        System.out.println("el numero de vuelo es:"+numVuelo+", la capacidad del vuelo es de:"+capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

}
