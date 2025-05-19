package controle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt"))) {
            writer.write("Giovanna");
            writer.newLine();
            writer.write("Kaleo");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
