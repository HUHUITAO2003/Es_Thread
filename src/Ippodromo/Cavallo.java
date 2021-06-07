package Ippodromo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Cavallo extends JPanel {

    int cordx; //coordinata del cavallo sull'asse x
    int cordy; //coordinata del cavallo sull'asse y
    Image img; //immagine del cavallo

    
    /**
     * costruttore per rappresentare l'immagine del cavallo sul campo
     *
     * @param y coordinata y su dove verra posizionato il cavallo
     * @param x quale corsie appartiene il cavallo, da qui dipende il colore dello sfondo del cavallo
     */
    public Cavallo(int y, int x) {
        cordx = 0;
        cordy = y;
        Toolkit tk = Toolkit.getDefaultToolkit();
        switch (x) {
            case 1: img = tk.getImage(this.getClass().getResource("/images/cavallo1.jpg")); break;
            case 2: img = tk.getImage(this.getClass().getResource("/images/cavallo2.jpg")); break;
            case 3: img = tk.getImage(this.getClass().getResource("/images/cavallo3.jpg")); break;
            case 4: img = tk.getImage(this.getClass().getResource("/images/cavallo4.jpg")); break;
            case 5: img = tk.getImage(this.getClass().getResource("/images/cavallo5.jpg")); break;
            case 6: img = tk.getImage(this.getClass().getResource("/images/cavallo6.jpg")); break;
            case 7: img = tk.getImage(this.getClass().getResource("/images/cavallo7.jpg")); break;
            case 8: img = tk.getImage(this.getClass().getResource("/images/cavallo8.jpg")); break;
            case 9: img = tk.getImage(this.getClass().getResource("/images/cavallo9.jpg")); break;
            case 10: img = tk.getImage(this.getClass().getResource("/images/cavallo10.jpg")); break;

        }
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 1);
        try {
            mt.waitForID(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /**
     * metodo per ottenere la coordinata x, ovvero la posizione del cavallo
     *
     */
    public int getCordx() {
        return cordx;
    }

    /**
     * metodo per modificare la coordinata x, ovvero la posizione del cavallo
     * @param cordx nuova posizione del cavallo sul campo
     */
    public void setCordx(int cordx) {
        this.cordx = cordx;
    }

    
    /**
     * metodo per "disegnare" l'immagine del cavallo sul campo
     *
     * @param g instanza per "disegnare" sul JPanel
     */
    public void paint(Graphics g) {
        g.drawImage(img, cordx, cordy, 70, 70, null);
    }

}
