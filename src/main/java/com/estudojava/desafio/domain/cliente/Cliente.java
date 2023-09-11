package com.estudojava.desafio.domain.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    private String nome;
    @Column(unique = true)
    private String documento;
    @Column(unique = true)
    private String email;
    private String senha;
    @Enumerated
    private TipoDeCliente tipo;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.documento = dados.documento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.tipo = dados.tipoDeCliente();
    }


}
