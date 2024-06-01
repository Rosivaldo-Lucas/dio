package simulacao_processo_seletivo_03;

public class ParametrosInvalidosException extends RuntimeException {
    private final String mensagem;

    public ParametrosInvalidosException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
