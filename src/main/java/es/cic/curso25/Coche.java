package es.cic.curso25;

public class Coche {

    private int velocidad;

    private final double CONSUMO_INSTANTANEO = 4.3;

    private Calculadora calculadora;

    public Coche() {
        this.calculadora = new Calculadora();
    }

    public int getVelocidad() {

        return this.velocidad;
    }

    public double getConsumo() {
        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);
        return (double) velocidad / 100 * CONSUMO_INSTANTANEO;
    }

    public int acelerar(int incrementoVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoVelocidad);

        this.velocidad = (int) Math.round(this.calculadora.getTotal());

        return this.velocidad;
    }

    public int frenar(int decrementoVelocidad) {

        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);

        if (this.getVelocidad() < decrementoVelocidad) {
            throw new ArithmeticException("La velocidad al frenar el coche no puede ser negativa,"
                    + " el maximo frenado será hasta que pare el coche (0)");
        }

        this.calculadora.restar(decrementoVelocidad);

        this.velocidad = (int) Math.round(this.calculadora.getTotal());

        return this.velocidad;

    }
}
