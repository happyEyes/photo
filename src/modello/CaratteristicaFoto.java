
package modello;


public class CaratteristicaFoto{

    private String nomeFile;
    private int larghezzaFotoOriginale;
    private int altezzaFotoOriginale;
    

    public int getAltezzaFoto() {
        return altezzaFotoOriginale;
    }

    public void setAltezzaFoto(int altezzaFoto) {
        this.altezzaFotoOriginale = altezzaFoto;
    }

    public int getLarghezzaFoto() {
        return larghezzaFotoOriginale;
    }

    public void setLarghezzaFoto(int larghezzaFoto) {
        this.larghezzaFotoOriginale = larghezzaFoto;
    }
}
