package com.estudojava.desafio.usuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;

public record DadosCadastroUsuario(
        @NotBlank
        String nomeCompleto,
        @NotBlank
        //@Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String documento,
        @NotNull
        @Valid
        TipoDeDocumento tipoDeDocumento,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String senha,
        @NotNull
        BigDecimal saldo,

        @NotNull
        @Valid
        TipoDeUsuario tipoDeUsuario) {
}
