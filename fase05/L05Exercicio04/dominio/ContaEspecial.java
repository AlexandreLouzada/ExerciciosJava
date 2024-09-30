package fase05.L05Exercicio04.dominio;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    // Getters e Setters para limite
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}
