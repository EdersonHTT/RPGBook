
package RPGBook.Models;

public class Mago extends Personagem{
    
    public Mago(String name) {
        super(name, 
            Math.max(Dados.rolarDados(1, 6) +2, 5),
            Math.max(Dados.rolarDados(2, 6) +3, 5),
            Math.max(Dados.rolarDados(1, 6), 5),
            Math.max(Dados.rolarDados(1, 6), 5)
        );
    }
    
    public String atacar( Personagem inimigo ) {
        boolean chance = this.calcularChanceDeAcerto(inimigo);
        
        if( chance ) {
            int dano = manaMax + this.rolarDados(1, 6);
            inimigo.setVida(inimigo.getVida() - dano);
            
            return "O ataque surtiu efeito\nDano causado: " + dano; 
        }
        
        return "O ataque falhou"; 
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
