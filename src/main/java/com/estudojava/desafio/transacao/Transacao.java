package com.estudojava.desafio.transacao;

import com.estudojava.desafio.cliente.Cliente;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "transacoes")
@Entity(name = "transacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "id_origem")
    private Cliente origem;
    @ManyToOne
    @JoinColumn(name = "id_destino")
    private Cliente destino;
    @Enumerated(EnumType.STRING)
    private TipoDeTransacao tipoDeTransacao;
    @Enumerated(EnumType.STRING)
    private StatusDaTransacao status;

    private LocalDateTime timestamp;

    public Transacao(DadosTransacao dados) {
        this.origem = dados.origem();
        this.destino = dados.destino();
        this.valor = dados.valor();
        this.status = dados.status();
        this.tipoDeTransacao = dados.tipoDeTransacao();
    }

}