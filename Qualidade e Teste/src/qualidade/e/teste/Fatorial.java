
package qualidade.e.teste;

public class Fatorial {
    
    public int Calcula (int i){
        int j = 1; 
        if (i == 0){
            j = 1;
        }
        if (i == 1){
            j = 1; 
        } 
        if (i > 1) {
            int result = 1; 
            for (int a = 1; a <= i ; ++a){
                result = result*a;
                j = result; 
            }
        }
        return j ; 
    }
    
  
        
        

    
}
