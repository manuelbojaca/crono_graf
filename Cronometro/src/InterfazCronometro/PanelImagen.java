package InterfazCronometro;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelImagen extends JPanel{
    
    private JLabel imagen;
    
    public PanelImagen(){
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        ImageIcon icono = new ImageIcon("imagenes/cronos.png");        
        imagen = new JLabel("");
        imagen.setIcon(icono);
        add(imagen);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.GRAY));
    }
}    
