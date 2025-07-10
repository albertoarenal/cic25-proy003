package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche c;
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        c = new Coche();
    }

    @Test
    void testAcelerar() {
        c.acelerar(34);
        int velocidadFinal = c.acelerar(23);

        assertEquals(57, velocidadFinal);
    }

    @Test
    void testFrenar() {
        c.acelerar(50);
        int velocidadFinal = c.frenar(23);

        assertEquals(27, velocidadFinal);

    }

    @Test
    void testFrenarMayorQueVelocidad(){

        c.acelerar(50);

        assertThrows(ArithmeticException.class,  () -> c.frenar(51), "El coche no puede frenar hasta tener una velocidad negativa");
    }

    @Test
    void testGetConsumo() {
        c.acelerar(50);
        double consumoActual = c.getConsumo();

        assertEquals(2.15, consumoActual);
    }

    @Test
    void testGetVelocidad() {
        c.acelerar(50);

        int velocidadFinal = c.getVelocidad();
    }
}
