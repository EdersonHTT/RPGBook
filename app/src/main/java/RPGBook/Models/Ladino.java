
package RPGBook.Models;

public class Ladino extends Personagem{

    public Ladino(String name) {
        super(name, 
                Dados.rolarDados(2, 6), 
                Dados.rolarDados(1, 6), 
               Dados.rolarDados(2, 6), 
                    Dados.rolarDados(4, 6) +4
        );
    }
    
}
