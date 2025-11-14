package RPGBook.Models;

public class Personagem {
    private String nome;
    private int vida;
    private int mana ;
    private int forca; 
    private int agilidade;
    
    public Personagem(String nome, int vida, int mana, int forca, int agilidade) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.agilidade = agilidade;
    }
    
    public void atacar( Personagem inimigo ) {
        
    }
    
    public void usarHabilidade( Personagem inimigo ) {
        
    }
    
    public void usarItem() {
        
    }
    
    public void fugir() {
        
    }
    
    public int rolarDados( int quantidade, int lados ) {
       int valor = 0;
       
       for(int i=0; i < quantidade; i++) {
           valor += Math.floor(Math.random()*lados);
       }
       
       return valor;
    }

    public void calcularChanceDeAcerto( Personagem inimigo ) {
        
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

}
