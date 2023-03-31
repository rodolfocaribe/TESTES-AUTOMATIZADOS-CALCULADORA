package br.edu.iftm.calculadorateste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculadoraTeste {
    CalculadoraSample calculadoraSample = new CalculadoraSample();

    @Test
    public void testSomar() {
        calculadoraSample.somar(2);
        assertEquals(3, calculadoraSample.getMemoria());
    }
    @Test
    public void testSubtrair() {
        calculadoraSample.subtrair(2);
        assertEquals(-1, calculadoraSample.getMemoria());
    }

    @Test
    public void testMultiplicar() {
        calculadoraSample.multiplicar(2);
        assertEquals(2, calculadoraSample.getMemoria());
    }
    @Test
    public void testDividir() throws Exception {
        calculadoraSample.dividir(2);
        assertEquals(0, calculadoraSample.getMemoria());
    }
    @Test
    public void testExponenciar() throws Exception {
        calculadoraSample.exponenciar(2);
        assertEquals(1, calculadoraSample.getMemoria());
    }
    @Test
    public void testZerarMemoria() {
        calculadoraSample.zerarMemoria();
        assertEquals(0, calculadoraSample.getMemoria());
    }
    @Test
    public void testGetMemoria() {
        assertEquals(1, calculadoraSample.getMemoria());
    }
    @Test
    public void testCalculadora() {
        CalculadoraSample calculadoraSample = new CalculadoraSample();
        assertEquals(1, calculadoraSample.getMemoria());
    }
}
