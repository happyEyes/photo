
package view;

import java.awt.Color;
import java.net.URL;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Vista extends javax.swing.JFrame {
    
    private Modello modello;
    private Controllo controllo;
    private HashMap<String, Object> mappaSottoViste = new HashMap<String, Object>();
    private JFileChooser fileChooser = new JFileChooser();
    private Log logger = LogFactory.getLog(this.getClass());

    
    static {
        selezionaLookAndFeel();
        JFrame.setDefaultLookAndFeelDecorated(true);
    }
    
    private static void selezionaLookAndFeel() {
        try {
            UIManager.put("nimbusBase", new Color(210, 210, 210));
            String lookAndFeelGtk = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
            javax.swing.UIManager.setLookAndFeel(lookAndFeelGtk);
        } catch (Exception e) {
            System.out.println("Eccezione nella selezione del look and feel: " + e);
        }
    }

    public Vista(Modello modello, Controllo controllo) {
        initComponents();
        this.modello = modello;
        this.controllo = controllo;
        inizializzaSottoViste();
        avviaSchermoIniziale();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        inizializzaAzioni();
    }
    
    public Controllo getControllo() {
        return controllo;
    }
    
    public Modello getModello() {
        return modello;
    }
    
    public HashMap<String, Object> getMappaSottoViste() {
        return mappaSottoViste;
    }
    
    public void setMappaSottoViste(HashMap<String, Object> mappaSottoViste) {
        this.mappaSottoViste = mappaSottoViste;
    }
    
    public Object getSottoVista(String nome) {
        return this.mappaSottoViste.get(nome);
    }
    
    public JFileChooser getJfileChooser() {
        return fileChooser;
    }
