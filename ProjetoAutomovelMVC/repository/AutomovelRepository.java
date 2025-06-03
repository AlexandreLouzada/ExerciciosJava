package ProjetoAutomovelMVC.repository;

import ProjetoAutomovelMVC.model.Automovel;
import java.io.*;
import java.util.*;

public class AutomovelRepository {
    private final List<Automovel> automoveis = new ArrayList<>();
    private final String arquivo = "automoveis.txt";

    public AutomovelRepository() {
        carregarDados();
    }

    public void adicionar(Automovel a) {
        automoveis.add(a);
    }

    public boolean remover(String placa) {
        return automoveis.removeIf(a -> a.getPlaca().equalsIgnoreCase(placa));
    }

    public Automovel buscarPorPlaca(String placa) {
        return automoveis.stream()
                .filter(a -> a.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .orElse(null);
    }

    public List<Automovel> listarTodos() {
        return new ArrayList<>(automoveis);
    }

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

    private void carregarDados() {
        File file = new File(arquivo);
        if (!file.exists()) return;
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

