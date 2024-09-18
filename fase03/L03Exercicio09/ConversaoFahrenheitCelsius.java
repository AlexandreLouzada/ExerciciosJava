package fase03.L03Exercicio09;

public class ConversaoFahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Tabela de conversão de Fahrenheit para Celsius");
        System.out.println("----------------------------------------------");
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("----------------------------------------------");

        // Loop para percorrer os valores de Fahrenheit de 100 a 150
        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
            // Fórmula para converter Fahrenheit em Celsius
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            
            // Exibindo a tabela com os valores formatados
            System.out.println(fahrenheit + "\t\t" + String.format("%.2f", celsius));
        }
    }
}
