package exemploGestaoFrota.repository;

import exemploGestaoFrota.model.Veiculo;
import exemploGestaoFrota.model.Carro;
import exemploGestaoFrota.model.Caminhao;
import exemploGestaoFrota.model.Tributavel;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Clean Code: Responsabilidade Única. Só lida com persistência em arquivo.
public class FrotaRepository {
    private static final String ARQUIVO_DADOS = "frota_mvc.txt";

    public void salvar(List<Veiculo> frota) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_DADOS))) {
            for (Veiculo v : frota) {
                // Serialização manual limpa para o arquivo
                String tipo = v.getClass().getSimpleName();
                if (v instanceof Carro) {
                     writer.write(String.format("CARRO;%s;%.2f\n", v.getPlaca(), v.getCustoFixoManutencao()));
                } else if (v instanceof Caminhao) {
                     writer.write(String.format("CAMINHAO;%s;%.2f\n", v.getPlaca(), v.getCustoFixoManutencao()));
                }
            }
        }
    }

    public List<Veiculo> carregar() throws IOException {
        List<Veiculo> frotaCarregada = new ArrayList<>();
        File file = new File(ARQUIVO_DADOS);
        
        if (!file.exists()) return frotaCarregada;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                String tipo = dados[0];
                String placa = dados[1];
                double custo = Double.parseDouble(dados[2].replace(",", "."));

                if (tipo.equals("CARRO")) {
                    frotaCarregada.add(new Carro(placa, custo, 0)); // KM zerado para fins de exemplo no recarregamento
                } else if (tipo.equals("CAMINHAO")) {
                    frotaCarregada.add(new Caminhao(placa, custo, 0.0));
                }
            }
        }
        return frotaCarregada;
    }
}
