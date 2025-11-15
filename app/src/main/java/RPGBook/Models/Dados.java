
package RPGBook.Models;

public class Dados {
    
    public static int rolarDados( int quantidade, int lados ) {
        int valor = 0;
       
       for(int i=0; i < quantidade; i++) {
           valor += Math.floor(Math.random()*lados);
       }
       
       return valor;
    }
}
