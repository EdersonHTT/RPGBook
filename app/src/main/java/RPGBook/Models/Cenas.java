
package RPGBook.Models;

public class Cenas {
    private String caminhoImagem;   // imagem principal
    private String caminhoTexto;    // imagem que contém o texto/narração
    private String escolhaEsq;      // rótulo do botão esquerdo
    private String escolhaDir;      // rótulo do botão direito
    private int proximaCenaEsq;     // índice (ID) da cena destino da esquerda
    private int proximaCenaDir;     // índice (ID) da cena destino da direita

    public Cenas(String caminhoImagem, String caminhoTexto,
                String escolhaEsq, String escolhaDir,
                int proximaCenaEsq, int proximaCenaDir) {
        this.caminhoImagem = caminhoImagem;
        this.caminhoTexto = caminhoTexto;
        this.escolhaEsq = escolhaEsq;
        this.escolhaDir = escolhaDir;
        this.proximaCenaEsq = proximaCenaEsq;
        this.proximaCenaDir = proximaCenaDir;
    }

    // Getters (úteis para usar em mostrarCena)
    public String getCaminhoImagem() { return caminhoImagem; }
    public String getCaminhoTexto() { return caminhoTexto; }
    public String getEscolhaEsq() { return escolhaEsq; }
    public String getEscolhaDir() { return escolhaDir; }
    public int getProximaCenaEsq() { return proximaCenaEsq; }
    public int getProximaCenaDir() { return proximaCenaDir; }
}
