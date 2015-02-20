package controllo;

import java.util.HashMap;
import java.util.Map;
import javax.swing.Action;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Controllo {

    private Vista vista;
    private Modello modello;
    private Modello history;
    private Map<String, Action> mappaAzioni = new HashMap<String, Action>();
    private Log logger = LogFactory.getLog(String.class);

    public Controllo() {
        inizializzaAzioni();
        this.modello = new Modello();
        this.history = new Modello();
        this.vista = new Vista(modello, this);
    }

    public Map<String, Action> getMappaAzioni() {
        return mappaAzioni;
    }

    public Modello getModello() {
        return modello;
    }

    public Vista getVista() {
        return vista;
    }

    public Modello getHistory() {
        return history;
    }
