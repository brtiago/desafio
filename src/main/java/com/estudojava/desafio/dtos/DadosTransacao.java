package com.estudojava.desafio.dtos;

import com.estudojava.desafio.domain.cliente.Cliente;
import com.estudojava.desafio.domain.transacao.StatusDaTransacao;
import com.estudojava.desafio.domain.transacao.TipoDeTransacao;

import java.math.BigDecimal;

public record DadosTransacao(
        Cliente origem,
        Cliente destino,
        BigDecimal valor,
        StatusDaTransacao status,
        TipoDeTransacao tipoDeTransacao) {
}
