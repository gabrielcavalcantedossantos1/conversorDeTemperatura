import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * obter do usuario se ele quer converter Celcius para Fahrenheit
         * Criar 2 funçoes para cada funçao escolhida
         * obter a temperatura de cada uma das funçoes escolhidas
         * mensagem personalizada para cada temperatura
         * */

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            int opcao = conversao();
            while (opcao != 1 && opcao != 2) {
                System.out.println("Digite um numero valido!");
                opcao = conversao();
            }

            System.out.println("Digite a temperatura em °" + (opcao == 1 ? "F" : "C") + " : ");
            double temperatura = scanner.nextDouble();

            if (opcao == 1) {
                System.out.println("A temperatura de " + temperatura + " °F é igual a " + Celsius(temperatura) + " °C");
            } else {
                System.out.println("A temperatura de " + temperatura + " °C é igual a " + fahrenheit(temperatura) + " °F");
            }

            System.out.println("Deseja continuar(s/n) : ");
            continuar = scanner.next();


            scanner.close();
        }


    }

    static int conversao() {
        System.out.println("Digite 1 para converter °F em °C ");
        System.out.println("Digite 2 para converter °C em °F");
        return scanner.nextInt();
    }

    static double fahrenheit(double celcius) {
        return ((celcius * 1.8) + 32);
    }

    static double Celsius(double fahrenheit) {
        return ((fahrenheit - 32) / 1.8);
    }
}