package qualidade.e.teste;

/**
 *
 * @author danie
 */
public class Boletos {
    
    public String PagaBoleto(float p1, float p2, float p3, float div1) {
        if ((p1+p2+p2 >= div1)&& ((p1 + p2 == 0)|| (p2+p3 == 0 ) || (p3+p1 ==0))){
            
            return "Pago";
        }
        return "Não pago";
}
    
}
