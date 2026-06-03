package exemploControleFrota.dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
    private List<Veiculo> frota;

    public GerenciadorFrota() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        this.frota.add(v);
        System.out.println("Veículo [" + v.getPlaca() + "] adicionado à frota com sucesso.");
    }

    // Gravação em Arquivo usando BufferedWriter
    public void salvarDadosEmArquivo(String nomeArquivo) {
        // try-with-resources garante o fechamento automático do arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                String tipo = v.getClass().getSimpleName();
                double ipva = (v instanceof Tributavel) ? ((Tributavel) v).calcularIPVA() : 0.0;
                
                String linha = String.format("Tipo: %s | Placa: %s | IPVA: R$ %.2f | Custo Total: R$ %.2f", 
                                             tipo, v.getPlaca(), ipva, v.calcularCustoTotal());
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("\n>>> Dados salvos no arquivo '" + nomeArquivo + "' com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }

    // Leitura do Arquivo usando BufferedReader
    public void lerDadosDoArquivo(String nomeArquivo) {
        System.out.println("\n--- LENDO DADOS DO ARQUIVO: " + nomeArquivo + " ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler dados do arquivo: " + e.getMessage());
        }
    }
}
