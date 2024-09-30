package fase05.L05Exercicio04.dominio;

public abstract class ContaBancaria {
    protected String cliente;
    protected int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    // Métodos Getters e Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return num_conta;
    }

    public void setNumConta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Métodos abstratos
    public abstract void sacar(float valor);

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Conta: " + num_conta + ", Saldo: " + saldo;
    }
}
