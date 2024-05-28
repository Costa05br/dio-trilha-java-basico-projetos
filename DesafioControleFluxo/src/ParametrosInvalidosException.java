public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        // Chama o construtor da classe pai (Exception) com a mensagem fornecida
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
    
}
