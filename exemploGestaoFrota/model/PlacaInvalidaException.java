package exemploGestaoFrota.model;

// Exceção de Domínio - Clean Code: Nome descreve exatamente o erro
public class PlacaInvalidaException extends RuntimeException {
    public PlacaInvalidaException(String placa) {
        super("A placa '" + placa + "' e invalida. Deve conter exatamente 7 caracteres.");
    }
}
