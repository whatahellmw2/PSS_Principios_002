/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY.AdequacaoAoPrincipio;

import DRY.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("COM principio DRY\n");
        Operacao transferencia = new Operacao("transferencia",500);
        Operacao saque = new Operacao("saque",200);
        Historico historico = new Historico();
        historico.addOperacao(transferencia);
        historico.addOperacao(saque);
        Cliente joao = new Cliente("joao", "14000", "1246651", 500, historico);
        joao.salvarDadosTxt();
        historico.salvarDadosTxt();
        
        
    }
    
}
