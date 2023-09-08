package com.estudojava.desafio.controller;

import com.estudojava.desafio.conta.Conta;
import com.estudojava.desafio.transacao.Transacao;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("transacao")
public class TransacaoController {
    private Conta conta;


    @PostMapping
    public void transacao(@RequestBody String json) {
        System.out.println(json);
    }

    public void transferir (BigDecimal valor, Conta origem, Conta destino){
        if(origem.getSaldo().compareTo(valor) >= 0) {
            origem.setSaldo(origem.getSaldo().subtract(valor));
            destino.setSaldo(destino.getSaldo().add(valor));
            System.out.println("Depósito vindo de " + origem.getId() + "no valor de "+ valor + " realizado com sucesso.");
        } else {
            System.out.println("Operação inválida: Saldo insuficiente!");
        }
    }
}
