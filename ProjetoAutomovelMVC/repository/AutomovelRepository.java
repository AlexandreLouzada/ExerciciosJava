package ProjetoAutomovelMVC.repository;

import ProjetoAutomovelMVC.model.Automovel;
import java.io.*;
import java.util.*;

//Gerenciar o armazenamento em memória 
//e a persistência em arquivo dos objetos Automovel.
public class AutomovelRepository {
    private final List<Automovel> automoveis = new ArrayList<>();
    private final String arquivo = "automoveis.txt";

    public AutomovelRepository() {
        carregarDados();
    }

    public void adicionar(Automovel a) {
        automoveis.add(a);
    }

    //Remove da lista automoveis qualquer objeto cujo valor de placa 
    //seja igual à placa informada, ignorando letras maiúsculas/minúsculas.
    
    public boolean remover(String placa) {
        return automoveis.removeIf(a -> a.getPlaca().equalsIgnoreCase(placa));
    }

    //Procurar na lista de automóveis o primeiro que tem a placa igual à informada, ignorando maiúsculas/minúsculas.
    //Se encontrar, retorna o objeto Automovel. Se não, retorna null.

    public Automovel buscarPorPlaca(String placa) {
        return automoveis.stream()
                .filter(a -> a.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .orElse(null);
    }

    public List<Automovel> listarTodos() {
        return new ArrayList<>(automoveis);
    }

    //salvar todos os objetos Automovel armazenados no ArrayList 
    //automoveis em um arquivo de texto, no formato .csv, 
    //sobrescrevendo o conteúdo existente.
    
    public void salvar() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Automovel a : automoveis) {
                writer.write(a.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    //Ao iniciar a aplicacao, carregar todos os automóveis salvos 
    //em arquivo texto e os adiciona ao ArrayList automoveis
    
    private void carregarDados() {
        File file = new File(arquivo);
        if (!file.exists())
            return;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                automoveis.add(Automovel.fromCSV(linha));
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
}
