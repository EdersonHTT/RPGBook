
package RPGBook.Models;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> inventario = new ArrayList<>();
    
    public ArrayList<Item> listar() {
        return inventario;
    }
    
    public String adicionarItem( Item item ) {
        if( inventario.size() < 6 ) {
            inventario.add(item);
            return "Item Adicionado ao inverntário";
        }
        
        return "Inventario cheio";
    }
    
    public boolean remover( int i ) {
        if( inventario.indexOf(inventario.get(i)) != -1 ) { 
            inventario.remove(i);
            return true;
        }
        
        return false;
    }
    
    public String usarItem( Potion potion ) {
        
    }
}
