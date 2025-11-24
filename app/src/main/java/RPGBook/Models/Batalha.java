
package RPGBook.Models;

public class Batalha {

    private Personagem jogador;
    private Personagem inimigo;
    
    private int rodadaHabilidade = 0;

    public Batalha(Personagem jogador, Personagem inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }
    
    public String jogadorAtaca(int dados, int lados) {
        // jogador ataca o inimigo
        String resultado = jogador.atacar(inimigo);

        // adiciona vida atual do inimigo
        resultado += " " + inimigo.getNome() + " tem " + inimigo.getVida() + " de vida";

        // se morreu
        if (inimigo.getVida() <= 0) {
            resultado += ". " + inimigo.getNome() + " foi derrotado!";
        }

        return resultado;
    }
    
    public String jogadorUsaHabilidade() {
        jogador.usarHabilidade(inimigo, rodadaHabilidade);

        String msg = "Habilidade usada! " 
                    + inimigo.getNome() + " tem " + inimigo.getVida() + " de vida";

        if (inimigo.getVida() <= 0) {
            msg += ". " + inimigo.getNome() + " foi derrotado!";
        }

        return msg;
    }
    
    public String jogadorUsaItem(Item item) {
        jogador.usarItem(item);
        return jogador.getNome() + " usou item!";
    }
    
    public boolean jogadorFoge() {
        return jogador.fugir();
    }
    
    public String turnoInimigo() {
        if (inimigo.getVida() <= 0) {
            return ""; // morto não ataca
        }

        String resultado = inimigo.atacar(jogador, 2, 6);

        resultado += " " + jogador.getNome() + " tem " + jogador.getVida() + " de vida";

        if (jogador.getVida() <= 0) {
            resultado += ". " + jogador.getNome() + " foi derrotado!";
        }

        return resultado;
    }
    
    public boolean batalhaAcabou() {
        return jogador.getVida() <= 0 || inimigo.getVida() <= 0;
    }

    public Personagem getJogador() { return jogador; }
    public Personagem getInimigo() { return inimigo; }
}
