package com.estudojava.desafio.conta;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "contas")
@Entity(name = "conta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idConta")

public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;

    private String titular;
    private BigDecimal saldoDisponivel;
    private BigDecimal saldoBloqueado;


}
