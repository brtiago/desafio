package com.estudojava.desafio.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Table(name = "clientes")
@Entity(name = "cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    @Column(unique = true)
    private String documento;
    @Column(unique = true)
    private String email;
    private String senha;
    @Enumerated
    private TipoDeCliente tipoDeCliente;

    public Cliente(DadosCadastroCliente dados) {
        this.nomeCompleto = dados.nomeCompleto();
        this.documento = dados.documento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.tipoDeCliente = dados.tipoDeCliente();
    }


}
