package com.estudojava.desafio.transacao;

import com.estudojava.desafio.usuario.Usuario;

import java.math.BigDecimal;

public record DadosTransacao(
        Usuario origem,
        Usuario destino,
        BigDecimal valor,
        StatusDaTransacao status) {
}
