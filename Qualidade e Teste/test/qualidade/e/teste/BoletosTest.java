
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
}
