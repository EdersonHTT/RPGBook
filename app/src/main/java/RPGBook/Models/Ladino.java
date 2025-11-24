
package RPGBook.Models;

public class Ladino extends Personagem{
    
    public Ladino(String name) {
        super(name, 
            Math.max(Dados.rolarDados(1, 6) +3, 5),
            Math.max(Dados.rolarDados(1, 6), 5),
            Math.max(Dados.rolarDados(1, 6), 5),
            Math.max(Dados.rolarDados(2, 6) +3, 5)
        );
    }
    
    public String usarHabilidade( Personagem inimigo, int rodadaHabilidade ) {
        if( rodadaHabilidade == 0 ) {
            int dano = this.forca + this.rolarDados(3, 6);
            inimigo.setVida(inimigo.getVida() - dano);
            this.mana -= 5;

            return "Acerta um Corte Sequencial\nDano causado: " + dano; 
        }
        return "Não pode usar a habilidade\nFaltam " + rodadaHabilidade + " rodadas" ; 
    }
}
