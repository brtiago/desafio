package com.estudojava.desafio.dtos;

import com.estudojava.desafio.domain.cliente.TipoDeCliente;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "Documento é obrigatório")
        //@Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String documento,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato do email é inválido")
        String email,

        @NotBlank(message = "A senha é obrigatória")
        String senha,

        @NotNull(message = "Tipo de cliente é obrigatório")
        @Valid
        TipoDeCliente tipoDeCliente) {
}
