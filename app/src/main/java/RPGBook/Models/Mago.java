
package RPGBook.Models;

public class Mago extends Personagem{

    public Mago(String name) {
        super(name, 
            Dados.rolarDados(2, 6), 
            Dados.rolarDados(4, 6) +3, 
            Dados.rolarDados(1, 6), 
            Dados.rolarDados(2, 6)
        );
    }
    
}
