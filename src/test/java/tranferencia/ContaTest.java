package tranferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "12345678900", "111111");
        silvioSantos = new Cliente("Silvio Santos", "00987654321", "22222");

        contaXuxa = new Conta("0024", "2254", 2500.00, xuxa);
        contaSilvio = new Conta("0026", "2251", 3500.00, silvioSantos);
    }

    @Test
    public void realizarTransacao() {
        contaXuxa.realizarTransferencia(1000.00, contaSilvio);

        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvio.getSaldo());
    }
    @Test
public void realizarTransferenciaInvalida(){
        boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaSilvio);
        assertFalse(resultado);
    }



    @Test
    public void validarAgencia() {
        assertEquals("0024", contaXuxa.getAgencia());
        assertEquals("0026", contaSilvio.getAgencia());

    }

    @Test
    public void validarNumeroConta(){
        assertEquals("2254", contaXuxa.getNumeroConta());
        assertEquals("2251", contaSilvio.getNumeroConta());
    }







}




















