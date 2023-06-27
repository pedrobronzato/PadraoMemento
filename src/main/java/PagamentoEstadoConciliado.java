public class PagamentoEstadoConciliado implements PagamentoEstado {

    private PagamentoEstadoConciliado() {};
    private static PagamentoEstadoConciliado instance = new PagamentoEstadoConciliado();
    public static PagamentoEstadoConciliado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Conciliado";
    }
    
    
}
