
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
    
    public String usarHabilidade( Personagem inimigo, int rodadaHabilidade ) {
        if( rodadaHabilidade == 0 ) {
            int dano = forca + this.rolarDados(2, 6);
            inimigo.setVida(inimigo.getVida() - dano);
            this.mana -= 5;
            
            return "Lança um Gaster Blaster\nDano causado: " + dano; 
        }
        return "Não pode usar a habilidade\nFaltam " + rodadaHabilidade + " rodadas" ; 
    }
    
}
