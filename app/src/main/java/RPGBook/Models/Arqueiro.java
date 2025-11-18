
package RPGBook.Models;

public class Arqueiro extends Personagem{

    public Arqueiro(String name) {
        super(name, 
            Dados.rolarDados(2, 6), 
            Dados.rolarDados(1, 6), 
            Dados.rolarDados(2, 6), 
            Dados.rolarDados(4, 6) +3
        );
    }
    
    public String usarHabilidade( Personagem inimigo, int rodadaHabilidade ) {
        if( rodadaHabilidade == 0 ) {
            int dano = this.forca + this.rolarDados(4, 4);
            inimigo.setVida(inimigo.getVida() - dano);
            this.mana -= 5;

            return "Usa Tormenta de Lanças\nDano causado: " + dano; 
        }
        return "Não pode usar a habilidade\nFaltam " + rodadaHabilidade + " rodadas" ; 
    }
    
}
