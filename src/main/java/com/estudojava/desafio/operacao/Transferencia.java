package com.estudojava.desafio.operacao;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transferencia {
    private String remetente;
    private String destinatario;
    private BigDecimal valor;
    private StatusDaTransferencia status;

    public Transferencia(DadosTransferencia dados) {
        this.remetente = dados.remetente();
        this.destinatario = dados.destinatario();
        this.valor = dados.valor();
        this.status = dados.status();
    }


}
