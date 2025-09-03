package Exemplos.exemploExcecao04;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Excecao04 {
    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("A idade mínima é 18 anos.");
        }
    }

    public static void main(String[] args) {
        try {
            verificarIdade(15);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
