package ProjetoAutomovelMVC.controller;

import ProjetoAutomovelMVC.model.Automovel;
import ProjetoAutomovelMVC.repository.AutomovelRepository;
import java.util.*;

public class AutomovelController {
    private final AutomovelRepository repo = new AutomovelRepository();

    public boolean incluir(Automovel novo) {
        if (repo.buscarPorPlaca(novo.getPlaca()) != null)
            return false;
        repo.adicionar(novo);
        return true;
    }

    public boolean excluir(String placa) {
        return repo.remover(placa);
    }

    public boolean alterar(String placa, Automovel novoDados) {
        Automovel existente = repo.buscarPorPlaca(placa);
        if (existente == null)
            return false;
        existente.setModelo(novoDados.getModelo());
        existente.setMarca(novoDados.getMarca());
        existente.setAno(novoDados.getAno());
        existente.setValor(novoDados.getValor());
        return true;
    }

    public Automovel consultar(String placa) {
        return repo.buscarPorPlaca(placa);
    }

  //Retorna uma lista de automóveis ordenada conforme o critério especificado.
  //Critérios válidos: "placa", "modelo", "marca".
 
public List<Automovel> listarOrdenado(String criterio) {
    // Recupera uma nova lista com todos os automóveis do repositório.
    List<Automovel> lista = repo.listarTodos();

    // Normaliza o critério para evitar problemas com letras maiúsculas/minúsculas
    switch (criterio.toLowerCase()) {

        case "placa":
            // Ordena a lista com base na placa do automóvel
            // Comparator.comparing recebe uma função que extrai o campo de comparação
            lista.sort(Comparator.comparing(Automovel::getPlaca));
            break;

        case "modelo":
            // Ordena a lista com base no modelo do automóvel
            lista.sort(Comparator.comparing(Automovel::getModelo));
            break;

        case "marca":
            // Ordena a lista com base na marca do automóvel
            lista.sort(Comparator.comparing(Automovel::getMarca));
            break;

        default:
            // Se o critério for inválido, nenhuma ordenação é aplicada
            System.out.println(" Critério inválido. A lista será retornada sem ordenação.");
            break;
    }

    // Retorna a lista (ordenada ou não, dependendo do critério)
    return lista;
}
    public void salvar() {
        repo.salvar();
    }
}
