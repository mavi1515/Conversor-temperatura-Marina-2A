
public class Fahrenheit extends Temperatura {
    
    public Fahrenheit(double valorGraus) {
        super(valorGraus);
    }
    //Criando o método para converter
    public double paraKelvin(){
     return getGraus()-32*5/9+273;
    }
    public double paraCelsius(){
    return (getGraus()-32)*5/9;
    }
     
    
}
