package com.estudojava.desafio.usuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;

public record DadosCadastroUsuario(
        @NotBlank
        String nome,
        @NotBlank
        String sobrenome,
        @NotBlank
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String cpf,
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
