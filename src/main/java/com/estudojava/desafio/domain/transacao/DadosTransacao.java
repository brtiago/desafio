package com.estudojava.desafio.domain.transacao;

import com.estudojava.desafio.domain.cliente.Cliente;

import java.math.BigDecimal;

public record DadosTransacao(
        Cliente origem,
        Cliente destino,
        BigDecimal valor,
        StatusDaTransacao status,
        TipoDeTransacao tipoDeTransacao) {
}
