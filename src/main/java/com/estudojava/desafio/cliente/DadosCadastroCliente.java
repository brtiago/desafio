package com.estudojava.desafio.cliente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(
        @NotBlank
        String nomeCompleto,
        @NotBlank
        //@Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String documento,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String senha,

        @NotNull
        @Valid
        TipoDeCliente tipoDeCliente) {
}
