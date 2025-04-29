
import java.util.Scanner;

public class ConversorTemperaturaMarina2A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("=====Conversor de temperatura=====");
            System.out.println("1. CELSIUS: ");
            System.out.println("2. FAHRENHEIT: ");
            System.out.println("3. KELVIN: ");
            System.out.println("4. SAIR: ");
            System.out.print(" Faça sua escolha 1-4");
            int escolha = scanner.nextInt();

            if (escolha == 4) {
                continuar = false;
                continue;

            }
            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("Digite o valor da temperatura: ");
            double graus = scanner.nextInt();

            switch (escolha) {
                case 1:                
                    
                    Celsius celsius = new Celsius (graus);
                
                    System.out.println("***********************");
                    System.out.println(" Resultado: ");
                    System.out.println(" Fahrenheit:" + celsius.paraFahrenheit());
                    System.out.println("Kelvin"+ celsius.paraKelvin());
                    break;
                case 2:
                    Fahrenheit f = new Fahrenheit(graus);
                    System.out.println("***************");
                     System.out.println(" Resultado: ");
                    System.out.println(" Celsius:" + f.paraCelsius());
                    System.out.println("Kelvin"+ f.paraKelvin());
                    System.out.println("**********************");
                    break;
                case 3:
                    Kelvin kelvin = new Kelvin(graus);
                    System.out.println("*****************");
                     System.out.println(" Resultado: ");
                    System.out.println(" Celsius:" + kelvin.paraCelsius());
                    System.out.println("Kelvin"+ kelvin.paraFahrenheit());
                    System.out.println("**********************");
                    break;
                    
            }
        }
        System.out.println("Fim do Programa!");
        scanner.close();

    }
}
