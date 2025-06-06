package fase05.L05Exercicio08.dominio;

public class Bicicleta implements Veiculo {
    private int velocidadeAtual = 0;
    private final int VELOCIDADE_MAXIMA = 50;

    @Override
    public void acelerar(int incremento) {
        if (velocidadeAtual + incremento > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += incremento;
        }
        System.out.println("A bicicleta acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public void frear(int decremento) {
        if (velocidadeAtual - decremento < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= decremento;
        }
        System.out.println("A bicicleta freou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

