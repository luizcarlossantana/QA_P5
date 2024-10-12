import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testAdicionar() {
        Assertions.assertEquals(5.0, calculadora.adicionar(2, 3));
        Assertions.assertEquals(-1.0, calculadora.adicionar(2, -3));
    }

    @Test
    public void testSubtrair() {
        Assertions.assertEquals(1.0, calculadora.subtrair(3, 2));
        Assertions.assertEquals(5.0, calculadora.subtrair(2, -3));
    }

    @Test
    public void testMultiplicar() {
        Assertions.assertEquals(6.0, calculadora.multiplicar(2, 3));
        Assertions.assertEquals(-6.0, calculadora.multiplicar(2, -3));
    }

    @Test
    public void testDividir() {
        Assertions.assertEquals(2.0, calculadora.dividir(6, 3));
        Assertions.assertEquals(-2.0, calculadora.dividir(6, -3));

        // Teste para divisão por zero
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(1, 0));
    }

    @Test
    public void testFatorial() {
        Assertions.assertEquals(120, calculadora.fatorial(5));
        Assertions.assertEquals(1, calculadora.fatorial(0));

        // Teste para fatorial de número negativo
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculadora.fatorial(-1));
    }

    @Test
    public void testPotencia() {
        Assertions.assertEquals(8.0, calculadora.potencia(2, 3));
        Assertions.assertEquals(0.125, calculadora.potencia(2, -3), 0.0001);
    }
}
