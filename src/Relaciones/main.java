package Relaciones;

public class main {
    public static void main(String[] args) {
        piloto piloto1 = new piloto(23,"marcos",10); //edad nombre rango
        avion avion1 = new avion("260405", "800", "SA1","miFlota1");
        flota flota1 = new flota();//ubi
        vuelo vuelo1 = new vuelo(2604,"España","Argentina");
        reserva reserva1 = new reserva(15);

        avion1.setVuelo(vuelo1);
        System.out.println(avion1.getPatente()+ " tiene asignado el vuelo "+ avion1.getVuelo().getNumeroDeVuelo());
    }
}
