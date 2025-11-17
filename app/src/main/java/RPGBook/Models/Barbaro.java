
package RPGBook.Models;

public class Barbaro extends Personagem{
    public Barbaro( String name ) {
        super(name, 
            Dados.rolarDados(4, 6) +4, 
            Dados.rolarDados(1, 6), 
            Dados.rolarDados(4, 6), 
            Dados.rolarDados(2, 6)
        );
    }
    
}
