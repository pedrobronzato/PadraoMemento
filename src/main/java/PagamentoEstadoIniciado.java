public class PagamentoEstadoIniciado implements PagamentoEstado {

    private PagamentoEstadoIniciado() {};
    private static PagamentoEstadoIniciado instance = new PagamentoEstadoIniciado();
    public static PagamentoEstadoIniciado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Iniciado";
    }
}
