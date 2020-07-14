
package qualidade.e.teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class BoletosTest {
    
    @Test
    public void Base() {
        Boletos b = new Boletos(); 
        assertEquals("Pago",b.PagaBoleto(3000,0,0,3000));
    }
    
    @Test
    public void pago1parcela(){
        Boletos b = new Boletos();
        assertEquals("Pago",b.PagaBoleto(3000,0,0,3000));
    }
    @Test
    public void nãoPago(){
        Boletos b = new Boletos();
        assertEquals("Não pago",b.PagaBoleto(25, 60, 80, 1000));
    }
    @Test
    public void quantasBoletosPagou(){
        Boletos b = new Boletos();
        assertEquals("Pagou com 1 boleto",b.quantosBoletosPagou(1000,0,0,1000));
    }
    @Test
    public void pagouCom2Boletos(){
        Boletos b = new Boletos();
        assertEquals("Pagou com 2 boletos",b.quantosBoletosPagou(0, 25, 2975, 3000));
    }
}
