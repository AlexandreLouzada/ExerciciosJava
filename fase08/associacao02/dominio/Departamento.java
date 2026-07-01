package fase08.associacao02.dominio;

import java.util.ArrayList;

public class Departamento {
    private String codigo;
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public boolean removerFuncionario(String matricula) {
        Funcionario funcionario = buscarFuncionario(matricula);

        if (funcionario != null) {
            funcionarios.remove(funcionario);
            return true;
        }

        return false;
    }

    public Funcionario buscarFuncionario(String matricula) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula().equals(matricula)) {
                return funcionario;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Departamento: " + nome +
               " | Funcionários: " + funcionarios.size();
    }
}
