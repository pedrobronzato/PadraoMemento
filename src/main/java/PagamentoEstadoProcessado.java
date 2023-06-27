public class PagamentoEstadoProcessado implements PagamentoEstado {
    private PagamentoEstadoProcessado() {};
    private static PagamentoEstadoProcessado instance = new PagamentoEstadoProcessado();
    public static PagamentoEstadoProcessado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Processado";
    }
}
