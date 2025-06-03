package ProjetoAutomovelMVC.controller;

import ProjetoAutomovelMVC.model.Automovel;
import ProjetoAutomovelMVC.repository.AutomovelRepository;
import java.util.*;

public class AutomovelController {
    private final AutomovelRepository repo = new AutomovelRepository();

    public boolean incluir(Automovel novo) {
        if (repo.buscarPorPlaca(novo.getPlaca()) != null) return false;
        repo.adicionar(novo);
        return true;
    }

    public boolean excluir(String placa) {
        return repo.remover(placa);
    }

    public boolean alterar(String placa, Automovel novoDados) {
        Automovel existente = repo.buscarPorPlaca(placa);
        if (existente == null) return false;
        existente.setModelo(novoDados.getModelo());
        existente.setMarca(novoDados.getMarca());
        existente.setAno(novoDados.getAno());
        existente.setValor(novoDados.getValor());
        return true;
    }

    public Automovel consultar(String placa) {
        return repo.buscarPorPlaca(placa);
    }

    public List<Automovel> listarOrdenado(String criterio) {
        List<Automovel> lista = repo.listarTodos();
        switch (criterio.toLowerCase()) {
            case "placa":
                lista.sort(Comparator.comparing(Automovel::getPlaca));
                break;
            case "modelo":
                lista.sort(Comparator.comparing(Automovel::getModelo));
                break;
            case "marca":
                lista.sort(Comparator.comparing(Automovel::getMarca));
                break;
        }
        return lista;
    }

    public void salvar() {
        repo.salvar();
    }
}

