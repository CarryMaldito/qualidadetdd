package qualidade.e.teste;

/**
 *
 * @author danie
 */
public class Boletos {
    
    public String PagaBoleto(float p1, float p2, float p3, float div1) {
        if ((p1+p2+p2 >= div1) && ((p1 + p2 == 0)|| (p2+p3 == 0 ) || (p3+p1 ==0))){
            
            return "Pago";
        }
        return "Não pago";
}   
    public String quantosBoletosPagou(float p1, float p2, float p3, float div1){
        
        if ((p1+p2+p3 >= div1) && ((p1 + p2 == 0)|| (p2+p3 == 0 ) || (p3+p1 ==0))){
            
            return "Pagou com 1 boleto";
        }
        if((p1+p2+p3 >= div1) && ((p1 == 0)|| (p2 == 0 ) || (p3 == 0))){
            return "Pagou com 2 boletos";
        }else{
            return "Pagou com 3 boletos";
        }
    }
    
}
