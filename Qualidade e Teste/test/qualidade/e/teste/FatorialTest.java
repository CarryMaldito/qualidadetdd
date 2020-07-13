
package qualidade.e.teste;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FatorialTest {
    //Testanto os casos base(para 0 e 1) identificando se as "exceção" no código retornam o resultado esperado.
     @Test
     public void casoBase(){
         Fatorial t = new Fatorial();
         assertEquals(1,t.Calcula(0));
     }
     @Test
     public void caso1(){
         Fatorial t = new Fatorial();
         assertEquals(1,t.Calcula(1));
     }
    //Realizando mais quatro testes com valores aleatórios que são aplicados a regra geral do Fatorial, no código. Caso sejam aprovados não haverá necessidade de testes adicionais, pois a regra princípal e exceções terão sido validadas. 
     @Test
     public void casoCinco(){
         Fatorial t = new Fatorial();
         assertEquals(120,t.Calcula(5));
     }
     @Test
     public void casoTres(){
         Fatorial t = new Fatorial();
         assertEquals(6,t.Calcula(3));
     }
     @Test
     public void caso6(){
         Fatorial t = new Fatorial();
         assertEquals(720,t.Calcula(6));
    }
     @Test
     public void caso10 (){
         Fatorial t = new Fatorial();
         assertEquals(3628800,t.Calcula(10));
     }
}
    
    
