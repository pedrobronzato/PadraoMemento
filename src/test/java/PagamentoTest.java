import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void deveArmazenarEstados() {
        Pagamento pagamento = new Pagamento();
        pagamento.setEstado(PagamentoEstadoIniciado.getInstance());
        pagamento.setEstado(PagamentoEstadoConciliado.getInstance());
        assertEquals(2, pagamento.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pagamento pagamento = new Pagamento();
        pagamento.setEstado(PagamentoEstadoIniciado.getInstance());
        pagamento.setEstado(PagamentoEstadoProcessado.getInstance());
        pagamento.restauraEstado(0);
        assertEquals(PagamentoEstadoIniciado.getInstance(), pagamento.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pagamento pagamento = new Pagamento();
        pagamento.setEstado(PagamentoEstadoIniciado.getInstance());
        pagamento.setEstado(PagamentoEstadoProcessado.getInstance());
        pagamento.setEstado(PagamentoEstadoConciliado.getInstance());
        pagamento.restauraEstado(1);
        assertEquals(PagamentoEstadoProcessado.getInstance(), pagamento.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pagamento pagamento = new Pagamento();
            pagamento.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }


}