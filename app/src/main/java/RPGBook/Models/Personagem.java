package RPGBook.Models;

public class Personagem {
    private String nome;
    private int vida;
    private int vidaMax;
    private int mana;    
    private int manaMax;
    private int forca; 
    private int agilidade;
    
    public Personagem(String nome, int vida, int mana, int forca, int agilidade) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMax = vida;
        this.mana = mana;        
        this.manaMax = mana;
        this.forca = forca;
        this.agilidade = agilidade;
    }
    
    public String atacar( Personagem inimigo ) {
        boolean chance = this.calcularChanceDeAcerto(inimigo);
        
        if( chance ) {
            int dano = forca + this.rolarDados(1, 6);
            inimigo.setVida(inimigo.getVida() - dano);
            
            return "O ataque surtiu efeito\nDano causado: " + dano; 
        }
        
        return "O ataque falhou"; 
    }
    
    public void usarHabilidade( Personagem inimigo ) {
        
    }
    
    public void usarItem() {
        
    }
    
    public void fugir() {
        
    }
    
    public int rolarDados( int quantidade, int lados ) {
       return Dados.rolarDados(quantidade, lados);
    }

    public boolean calcularChanceDeAcerto( Personagem inimigo ) {
        int chance = 50 + (agilidade - inimigo.getAgilidade()) * 5;
        int rolagem = this.rolarDados( 1, 100);
        
        return chance >= rolagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getManaMax() {
        return manaMax;
    }

    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }

}
