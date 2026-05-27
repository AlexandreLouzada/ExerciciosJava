package exemploCrontroleFrota.dominio;

// Herdar de RuntimeException torna a exceção Não-Verificada (Unchecked)
public class PlacaInvalidaException extends RuntimeException {
    public PlacaInvalidaException(String placa) {
        super("A placa '" + placa + "' é inválida! O tamanho correto deve ser de exatamente 7 caracteres.");
    }
}
