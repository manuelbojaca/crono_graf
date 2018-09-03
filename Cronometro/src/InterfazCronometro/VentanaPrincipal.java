package InterfazCronometro;

import LogicaCronometro.Cronometro;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

public class VentanaPrincipal extends JFrame{
    
    private PanelBotones panelBotones;
    private PanelCronometro panelCronometro;
    private PanelImagen panelImagen;
    private PanelMemoria panelMemoria;
    private Cronometro crono;
    private boolean corriendo;
    private boolean retrocediendo;
    private Timer timer;

    public VentanaPrincipal(){

        setTitle("Cronometro");
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(650,450);

        panelMemoria = new PanelMemoria();
        getContentPane().add(panelMemoria,BorderLayout.WEST);
        
        panelImagen = new PanelImagen();
        getContentPane().add(panelImagen,BorderLayout.NORTH);
    
        panelCronometro = new PanelCronometro();
        getContentPane().add(panelCronometro,BorderLayout.CENTER);
    
        panelBotones = new PanelBotones(this);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);
        
        crono = new Cronometro();
        
        timer = new Timer();
        corriendo = false;
        retrocediendo = false;
        timer.schedule(new Tarea(),0,1000);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    public void iniciarCronometro(){
    
        retrocediendo = false;
        corriendo = true;
        
    }
    public void pararCronometro(){
        
        corriendo = false;
        
    }
    public void borrarCronometro(){
        
        crono.borrar();
        panelCronometro.actualizar(crono.getHoraString(), crono.getMinutoString(), crono.getSegundoString());
        corriendo = false;
        retrocediendo = false;
        
    }
    public void retrocederCronometro(){
        corriendo = false;
        retrocediendo = true;
    }
    public void guardarCronometro(){
        
        crono.guardarMemoria();
        panelMemoria.actualizar(crono.getHoraString(), crono.getMinutoString(), crono.getSegundoString());
        
    }
    private class Tarea extends TimerTask{
        
        @Override
        public void run(){
            if(corriendo){
                crono.avanzar();
            }
            if(retrocediendo){
                crono.retroceder();
            }
            panelCronometro.actualizar(crono.getHoraString(), crono.getMinutoString(), crono.getSegundoString());
        }
        
    }
}