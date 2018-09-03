package InterfazCronometro;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCronometro extends JPanel{
    
    private JLabel horas;
    private JLabel minutos;
    private JLabel segundos;
    private JLabel puntos = new JLabel(":");
    private JLabel puntos2 = new JLabel(":");
    
    public PanelCronometro(){
        setLayout(new GridLayout(1,5));
        horas = new JLabel("0");
        horas.setHorizontalAlignment(JLabel.CENTER);
        horas.setForeground(Color.BLUE.darker());
        horas.setFont(new Font("Tahoma",Font.BOLD,32));
        
        minutos = new JLabel("0");
        minutos.setHorizontalAlignment(JLabel.CENTER);
        minutos.setForeground(Color.BLUE.darker());
        minutos.setFont(new Font("Tahoma",Font.BOLD,32));
        
        segundos = new JLabel("0");
        segundos.setHorizontalAlignment(JLabel.CENTER);
        segundos.setForeground(Color.BLUE.darker());
        segundos.setFont(new Font("Tahoma",Font.BOLD,32));
        
        puntos.setHorizontalAlignment(JLabel.CENTER);
        puntos.setForeground(Color.BLUE.darker());
        puntos.setFont(new Font("Tahoma",Font.BOLD,32));
   
        puntos2.setHorizontalAlignment(JLabel.CENTER);
        puntos2.setForeground(Color.BLUE.darker());
        puntos2.setFont(new Font("Tahoma",Font.BOLD,32));
 
        add(horas);
        add(puntos);
        add(minutos);
        add(puntos2);
        add(segundos);
    }
    
    public void actualizar(String h, String m, String s){
        horas.setText(h);
        minutos.setText(m);
        segundos.setText(s);
    }
}
