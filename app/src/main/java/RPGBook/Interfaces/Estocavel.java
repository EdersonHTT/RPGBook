
package RPGBook.Interfaces;

public interface Estocavel {
    private int quantidade = 0;
    
    public void incrementar( int quantia ) {
        quantidade += quantia;
    }
    
    public void decrementar() {
        quantidade--;
    }
}
