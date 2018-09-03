package InterfazCronometro;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel implements ActionListener{
    
    private VentanaPrincipal padre;
    private JButton btnIniciar;
    private JButton btnBorrar;
    private JButton btnParar;
    private JButton btnRetroceder;
    private JButton btnGuardar;
    
    public PanelBotones(VentanaPrincipal elPadre){
        
        padre = elPadre;
        
        setBorder(new TitledBorder("Opciones"));
        setLayout(new GridLayout(1,4)); 
        
        btnIniciar = new JButton("Iniciar");
        btnIniciar.setActionCommand("INICIAR");
        btnIniciar.addActionListener(this);
        add(btnIniciar);

        btnParar = new JButton("Parar");
        btnParar.setActionCommand("PARAR");
        btnParar.addActionListener(this);
        add(btnParar);
        
        btnBorrar = new JButton("Borrar");
        btnBorrar.setActionCommand("BORRAR");
        btnBorrar.addActionListener(this);
        add(btnBorrar);
        
        btnRetroceder = new JButton("Retroceder");
        btnRetroceder.setActionCommand("RETROCEDER");
        btnRetroceder.addActionListener(this);
        add(btnRetroceder);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setActionCommand("GUARDAR");
        btnGuardar.addActionListener(this);
        add(btnGuardar);
    }    
    public void actionPerformed(ActionEvent e){

        if(("INICIAR").equals(e.getActionCommand())){
            padre.iniciarCronometro();
        }
        else if(("BORRAR").equals(e.getActionCommand())){
            padre.borrarCronometro();
        }
        else if(("RETROCEDER").equals(e.getActionCommand())){
            padre.retrocederCronometro();
        }
        else if(("GUARDAR").equals(e.getActionCommand())){
            padre.guardarCronometro();
        }
        else if(("PARAR").equals(e.getActionCommand())){
            padre.pararCronometro();
        }
    }
}

