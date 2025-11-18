
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
