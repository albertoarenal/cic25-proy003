package es.cic.curso25;

public class Coche {

    private int velocidad;

    private final double CONSUMO_INSTANTANEO = 4.3;

    public int getVelocidad() {

       return this.velocidad;
    }

    public double getConsumo() {
        // TODO
        return (double) velocidad / 100 * CONSUMO_INSTANTANEO;
    }

    public int acelerar(int incrementoVelocidad) {
        this.velocidad += incrementoVelocidad;

        return this.velocidad;
    }

    public int frenar(int decrementoVelocidad) {
        this.velocidad -= decrementoVelocidad;

        return this.velocidad;
    }
}
