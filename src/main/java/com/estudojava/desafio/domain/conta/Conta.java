package com.estudojava.desafio.domain.conta;

import com.estudojava.desafio.domain.cliente.Cliente;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "contas")
@Entity(name = "conta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente idCliente;
    private BigDecimal saldo;

    public Conta(Cliente idCliente, BigDecimal saldoDisponivel) {
        this.idCliente = idCliente;
        this.saldo = saldoDisponivel;
    }

    public void debitar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
        }
    }

     public void creditar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) >= 0) {
            saldo = saldo.add(valor);
        }
     }

}
