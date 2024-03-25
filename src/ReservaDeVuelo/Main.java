package ReservaDeVuelo;

public class Main {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("pia lavilla",46398641);
        Reserva reserva1 = new Reserva(46);
        Vuelo vuelo1 = new Vuelo(500,26);
        Pago pago1 = new Pago("debito",10000);


        //asociar la reserva y el vuelo al pasajero
        pasajero1.asignarReserva(reserva1);
        reserva1.asignarVuelo(vuelo1);
        //realizar el pago para la reserva del vuelo
        pago1.realizarPago();
        //mostrar la info del vuelo reservado
        System.out.println("Detalles del vuelo reservado:");
        System.out.println("Número de vuelo: " + vuelo1.getNumVuelo());
        System.out.println("Asiento reservado:"+reserva1.getNumDeAsiento()); //se pone el get para q muestre el asiento exacto


    }
}
