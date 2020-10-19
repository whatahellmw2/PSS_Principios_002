/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOD.AdequacaoAoPrincipio;

import LOD.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("COM principio LOD\n");
        Carteira carteiDoJoao = new Carteira(500);
        Cliente joao= new Cliente("joao",carteiDoJoao);
        Jornaleiro jornaleiro= new Jornaleiro(joao, 133);
        jornaleiro.coletarPagamento();
        joao.imprimeCliente();
    }
}
