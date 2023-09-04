package com.estudojava.desafio.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;

    @Column(unique = true)
    private String documento;
    @Column(unique = true)
    private String email;
    private String senha;
    private BigDecimal saldo;
    @Enumerated
    private TipoDeUsuario tipoDeUsuario;

    public Usuario(DadosCadastroUsuario dados) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
