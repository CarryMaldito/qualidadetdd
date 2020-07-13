
package estatistica.descritiva;


public class EstatisticaDescritiva {
    
public void Media(int n,float[] amostra){
    int i;
    float med,soma;
    soma = 0;    
 for (i = 1;i<=n;i++){
     soma = soma + amostra[i];
 }
 med = (soma/n);
System.out.println("a media é :");
System.out.println(med);
}
    
    public static void main(String[] args) {
        
        float amostra[20];
        int n;
        System.out.print("digite o tamanho da sua amostra ");
        n = 20;
        
    }
    
}
