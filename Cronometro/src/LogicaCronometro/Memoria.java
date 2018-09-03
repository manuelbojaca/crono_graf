package LogicaCronometro;

public class Memoria {
    
    private UnidadDeTiempo segundos;
    private UnidadDeTiempo minutos;
    private UnidadDeTiempo horas;
    
    public void guardar(UnidadDeTiempo horas, UnidadDeTiempo minutos, UnidadDeTiempo segundos){
        
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    public UnidadDeTiempo getSegundos(){
        return this.segundos;
    }
    public UnidadDeTiempo getMinutos(){
        return this.minutos;
    }
    public UnidadDeTiempo getHoras(){
        return this.horas;
    }
    public void setSegundos(UnidadDeTiempo segundos){
        this.segundos = segundos;
    }
    public void setMinutos(UnidadDeTiempo minutos){
        this.minutos = minutos;
    }
    public void setHoras(UnidadDeTiempo horas){
        this.horas = horas;
    }
}
