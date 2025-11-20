
package RPGBook.Models;

import RPGBook.Interfaces.Estocavel;

public class Potion extends Item implements Estocavel {
    private int efeitoAdicional;
    private String atributo;
    private int quantidade = 0;

    public Potion(String nome, int efeitoAdicional, String atributo) {
        super(nome);
        this.efeitoAdicional = efeitoAdicional;
        this.atributo = atributo;
    }
    
    public void incrementar( int quantia ) {
        quantidade += quantia;
    }
    
    public void decrementar() {
        quantidade--;
    }
    
}
