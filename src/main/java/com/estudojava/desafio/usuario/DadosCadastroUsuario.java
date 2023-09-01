package com.estudojava.desafio.usuario;

import java.math.BigDecimal;

public record DadosCadastroUsuario(String nome, String sobrenome, String cpf, String email, String senha, BigDecimal saldo, TipoDeUsuario tipoDeUsuario) {
}
