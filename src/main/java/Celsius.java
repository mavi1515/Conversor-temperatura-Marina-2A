
public class Celsius extends Temperatura {
    
    public Celsius(double valorGraus) {
       super(valorGraus);
    }
    
    //criando os métodos para converter
    public double paraFahrenheit(){
     return (getGraus()*9/5)+32;
    }
    //mudando de celsius para kelvin
    public double paraKelvin(){
     return getGraus()+273;
    }
}
