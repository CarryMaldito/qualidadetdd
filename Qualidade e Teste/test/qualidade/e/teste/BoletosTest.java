
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
        BoletosTest b = new BoletosTest(); 
        assertEquals("Pago",b.PagaBoleto());
    }
    
}
