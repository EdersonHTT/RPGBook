
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
    
    public String usarHabilidade( Personagem inimigo, int rodadaHabilidade ) {
        if( rodadaHabilidade == 0 ) {
            int dano = this.forca + this.rolarDados(2, 6) + 5;
            inimigo.setVida(inimigo.getVida() - dano);
            this.mana -= 5;

            return "Usa o Golpe do Rei\nDano causado: " + dano; 
        }
        return "Não pode usar a habilidade\nFaltam " + rodadaHabilidade + " rodadas" ; 
    }
    
}
