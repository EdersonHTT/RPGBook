
package RPGBook.Models;

public class Barbaro extends Personagem{
    

    public Barbaro( String name ) {
        
        int forca = super.rolarDados(5, 6);
        int vida = super.rolarDados(5, 6);
        int mana = super.rolarDados(5, 6);
        int agilidade = super.rolarDados(5, 6);
        super(name, vida, mana, forca, agilidade);
    }
    
}
