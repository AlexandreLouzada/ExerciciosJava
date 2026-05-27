package exemploRH.controle;
import exemploRH.dominio.*;

public class ControlaFuncionario {
    public static void main(String[] args) {
        // Polimorfismo: referências do tipo Funcionario apontando para objetos filhos
        Funcionario func1 = new Gerente("Alexandre", 5000.0, 1500.0);
        Funcionario func2 = new Desenvolvedor("Tiago", 4000.0, 10);


        System.out.println("Funcionário: " + func1.getNome() + " | Salário: R$ " + func1.calcularSalario());
        System.out.println("Funcionário: " + func2.getNome() + " | Salário: R$ " + func2.calcularSalario());
    }
}

