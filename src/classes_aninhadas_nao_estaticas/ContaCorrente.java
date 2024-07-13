package classes_aninhadas_nao_estaticas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {

    private BigDecimal saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public ContaCorrente(BigDecimal saldoInicial) {
        this.saldo = saldoInicial;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return Collections.unmodifiableList(transacoes);
    }

    public class Transacao { // Classe aninhada não estatica

        private String descricao;
        private BigDecimal valor;

        public Transacao(String descricao, BigDecimal valor) {
            this.descricao = descricao;
            this.valor = valor;

            saldo = saldo.subtract(valor);
            transacoes.add(this); /* Vai retornar a propria Instancia */
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValor() {
            return valor;
        }

    }

}