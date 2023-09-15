package com.estudojava.desafio.dtos;

import java.math.BigDecimal;

public record DadosTransacaoDTO(
        BigDecimal valor,
        Long origem,
        Long destino
) {}
