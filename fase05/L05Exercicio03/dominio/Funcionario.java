package fase05.L05Exercicio03.dominio;

public abstract class Funcionario {

        protected String nome;
        protected String departamento;
        protected double salarioBase;
    
        public Funcionario(String nome, String departamento, double salarioBase) {
            this.nome = nome;
            this.departamento = departamento;
            this.salarioBase = salarioBase;
        }
    
        public String getNome() {
            return nome;
        }
    
        public String getDepartamento() {
            return departamento;
        }
    
        public double getSalarioBase() {
            return salarioBase;
        }
    
        // Método abstrato para calcular o salário
        public abstract double calcularSalario();
    
        // Método para exibir informações do funcionário
        public void mostrarInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Departamento: " + departamento);
            System.out.println("Salário Base: R$ " + salarioBase);
        }
}
    

