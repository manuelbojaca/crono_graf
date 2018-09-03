package InterfazCronometro;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelMemoria extends JPanel{
    
    private JLabel[] memoria;
    private int contador;
    
    public PanelMemoria(){
        
        setLayout(new GridLayout(5,1));
        setBorder(new TitledBorder("Memoria"));
        setSize(10,50);
        
        memoria = new JLabel[5];
        for(int i=0;i<5;i++){
            memoria[i] = new JLabel("00:00:00");
            memoria[i].setHorizontalAlignment(JLabel.CENTER);
            memoria[i].setForeground(Color.GRAY.darker());
            memoria[i].setFont(new Font("Tahoma",Font.BOLD,12));
            add(memoria[i]);
        }
        contador = 0;
    }
    public void actualizar(String h, String m, String s){
        memoria[contador].setText(h+":"+m+":"+s);
        contador++;
        if(contador>4){
            contador=0;
        }
    }
}
