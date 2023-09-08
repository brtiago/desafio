package com.estudojava.desafio.transacao;

import com.estudojava.desafio.cliente.Cliente;

import java.math.BigDecimal;

public record DadosTransacao(
        Cliente origem,
        Cliente destino,
        BigDecimal valor,
        StatusDaTransacao status,
        TipoDeTransacao tipoDeTransacao) {
}
