package com.estudojava.desafio.transacao;

import com.estudojava.desafio.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;

@Table(name = "transferencias")
@Entity(name = "transferencia")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "id_origem")
    private Usuario origem;
    @ManyToOne
    @JoinColumn(name = "id_destino")
    private Usuario destino;

    private StatusDaTransacao status;

    public Transacao(DadosTransacao dados) {
        this.origem = dados.origem();
        this.destino = dados.destino();
        this.valor = dados.valor();
        this.status = dados.status();
    }


    public Transacao() {

    }
}