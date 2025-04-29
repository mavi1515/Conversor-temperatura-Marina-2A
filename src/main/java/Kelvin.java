
public class Kelvin extends Temperatura{
    
    public Kelvin(double valorGraus) {
        super(valorGraus);
    }
    //Criando o método para converter
    public double paraCelsius(){
      return getGraus()-273;
    }
    public double paraFahrenheit(){
    return (paraCelsius()*9/5)+32;
    }
}
