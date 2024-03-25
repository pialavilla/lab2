package ReservaDeVuelo;

public class Pago {
    private String metodoPago;
    private int importe;

    public Pago() {
    }



    public Pago(String metodoPago,int importe) {
        this.metodoPago = metodoPago;
        this.importe = importe;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    public void realizarPago(){
        //implementar logica para procesar pago
        System.out.println("Se ha realizado un pago de "+importe+" usando "+metodoPago);
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
}
