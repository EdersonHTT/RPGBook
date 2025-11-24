
package RPGBook.Models;

public class Arqueiro extends Personagem{
    
    public Arqueiro(String name) {
        super(name, 
            Math.max(Dados.rolarDados(2, 6), 5),
            Math.max(Dados.rolarDados(1, 6), 5),
            Math.max(Dados.rolarDados(2, 6), 5),
            Math.max(Dados.rolarDados(4, 6) +3, 5)
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
