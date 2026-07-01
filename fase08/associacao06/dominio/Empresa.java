package fase08.associacao06.dominio;

import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String nome;
    private ArrayList<Departamento> departamentos;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public Departamento buscarDepartamento(String codigo) {
        for (Departamento departamento : departamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                return departamento;
            }
        }

        return null;
    }

    public boolean removerDepartamento(String codigo) {
        Departamento departamento = buscarDepartamento(codigo);

        if (departamento != null) {
            departamentos.remove(departamento);
            return true;
        }

        return false;
    }

    public Funcionario buscarFuncionario(String matricula) {
        for (Departamento departamento : departamentos) {
            Funcionario funcionario = departamento.buscarFuncionario(matricula);

            if (funcionario != null) {
                return funcionario;
            }
        }

        return null;
    }

    public double calcularFolhaSalarialTotal() {
        double total = 0;

        for (Departamento departamento : departamentos) {
            total += departamento.calcularFolhaSalarial();
        }

        return total;
    }

    @Override
    public String toString() {
        return "CNPJ: " + cnpj +
               " | Empresa: " + nome +
               " | Departamentos: " + departamentos.size() +
               " | Folha total: R$ " + calcularFolhaSalarialTotal();
    }
}