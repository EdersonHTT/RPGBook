
package RPGBook.Models;

public class Barbaro extends Personagem{
    public Barbaro( String name ) {
        super(name, 
                Personagem.rolarDados(4, 6) +4, 
            Personagem.rolarDados(1, 6), 
           Personagem.rolarDados(4, 6), 
        Personagem.rolarDados(2, 6)
        );
    }
    
}
