
package ppap;

public class PPAP {

    public static void main(String[] args) {
        
      Carteira c = new Carteira();
      Carteira d = new Carteira();
      
      c.comp = 3;
      c.cor = ("yellow");
      c.preço = 17;
      c.ziper = true;
      
      d.comp = 5;
      d.cor = ("preta");
      d.preço = 180;
      d.ziper = false;
      
      
      c.imprime();
    }
    
}
