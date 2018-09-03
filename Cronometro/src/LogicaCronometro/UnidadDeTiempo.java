package LogicaCronometro;

public class UnidadDeTiempo{
    private int valor;
    private int tope;
    
    public UnidadDeTiempo(int tope){
        this.tope=tope;
        this.valor=0;
    }
    public void avanzar(){
        this.valor++;
        if(this.valor == tope)
            this.valor=0; 
    }
    public void retroceder(){
        this.valor--;
        if(this.valor < 0){
            this.valor = tope -1;
        }
    }
    public void borrar(){
        this.valor = 0;
    }
    public int getValor(){
        return this.valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getTope(){
        return this.tope;
    }
    public void setTope(int tope){
        this.tope = tope;
    }
}
