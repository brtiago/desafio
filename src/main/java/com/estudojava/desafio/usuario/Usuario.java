package com.estudojava.desafio.usuario;

import com.estudojava.desafio.conta.Conta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

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
    private String nomeCompleto;
    @Column(unique = true)
    private String documento;

    @Enumerated
    TipoDeDocumento tipoDeDocumento;

    @Column(unique = true)
    private String email;
    private String senha;
    private BigDecimal saldo;
    @Enumerated
    private TipoDeUsuario tipoDeUsuario;


    public Usuario(@NotNull DadosCadastroUsuario dados) {
        this.nomeCompleto = dados.nomeCompleto();
        this.documento = dados.documento();
        this.tipoDeDocumento = dados.tipoDeDocumento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.saldo = dados.saldo();
        this.tipoDeUsuario = dados.tipoDeUsuario();
    }
}
