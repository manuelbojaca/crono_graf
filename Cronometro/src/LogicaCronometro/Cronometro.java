package LogicaCronometro;

public class Cronometro {
    
    private UnidadDeTiempo segundo;
    private UnidadDeTiempo minuto;
    private UnidadDeTiempo hora;
    private Memoria[] memorias;
    private int contMemoria;
    
    public Cronometro(){
        this.segundo = new UnidadDeTiempo(60);
        this.minuto = new UnidadDeTiempo(60);
        this.hora = new UnidadDeTiempo(24);
        this.memorias = new Memoria[5];
        for(int i=0;i<5;i++){
            this.memorias[i] = new Memoria();
        }
        this.contMemoria = 0;
        
    }
    public void avanzar(){
        this.segundo.avanzar();
        if(this.segundo.getValor() == 0)
            this.minuto.avanzar();
        if(this.minuto.getValor() == 0)
            this.hora.avanzar();
    }
    public void retroceder(){
        this.segundo.retroceder();
        if(this.segundo.getValor() == this.segundo.getTope()-1)
            this.minuto.retroceder();
        if(this.minuto.getValor() == this.segundo.getTope()-1)
            this.hora.retroceder();
    }
    public void borrar(){
        this.segundo.borrar();
        this.minuto.borrar();
        this.hora.borrar();
    }
    public void guardarMemoria(){
        this.memorias[this.contMemoria].guardar(this.hora, this.minuto, this.segundo);
        contMemoria++;
        if(contMemoria>4){
            contMemoria = 0;
        }
    }
    public UnidadDeTiempo getSegundo(){
        return this.segundo;
    }
    public void setSegundo(UnidadDeTiempo segundo){
        this.segundo = segundo;
    }
    public UnidadDeTiempo getMinuto(){
        return this.minuto;
    }
    public void setMinuto(UnidadDeTiempo minuto){
        this.minuto = minuto;
    }
    public UnidadDeTiempo getHora(){
        return this.segundo;
    }
    public void setHora(UnidadDeTiempo hora){
        this.hora = hora;
    }
    public String getHoraString(){
        return Integer.toString(this.hora.getValor());
    }
    public String getMinutoString(){
        return Integer.toString(this.minuto.getValor());
    }
    public String getSegundoString(){
        return Integer.toString(this.segundo.getValor());
    }
}
