package com.estudojava.desafio.operacao;

import java.math.BigDecimal;

public record DadosTransferencia(
        String remetente,
        String destinatario,
        BigDecimal valor,
        StatusDaTransferencia status) {
}
