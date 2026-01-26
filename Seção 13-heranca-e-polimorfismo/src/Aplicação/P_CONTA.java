package Aplicação;

import java.util.ArrayList;
import java.util.List;

import Entidades.CONTA;
import Entidades.Conta_Corrente;
import Entidades.Conta_Empresarial;

public class P_CONTA {
    public static void main(String[] args) {
        List<CONTA> continha = new ArrayList<>();

        continha.add(new Conta_Corrente(1001, "Alex", 500.00, 0.01));
        continha.add(new Conta_Empresarial(1002, "Maria", 1000.0, 400.0));
        continha.add(new Conta_Corrente(1004, "Bob", 300.0, 0.01));
        continha.add(new Conta_Empresarial(1005, "Anna", 500.0, 500.0));

        // Exemplo: totalizar saldo
        double total = 0.0;
        for (CONTA c : continha) {
            total += c.getSaldo();
        }
        System.out.println("Saldo total: " + total);

        // Exemplo: depositar 10 em todas as contas
        for (CONTA c : continha) {
            c.deposito(10.0);
            System.out.println("Saldo atualizado!");
        }
    }
}/*Suponhaqueemumnegóciorelacionadoabanco, apenas
contas poupança e contas para empresas sãopermitidas.
Nãoexistecontacomum.
Para garantir que contas comuns não possam ser
instanciadas, bastaacrescentarmosapalavra"abstract"na
declaraçãodaclasse.
•Demo:suponhaquevocêqueira:
• Totalizarosaldodetodasascontas.
• Depositar10.00emtodasascontas.*/