/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP.AdequacaoAoPrincipio;

import LSP.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("COM principio LSP\n");
        
       Frete frete1= new Frete(100,0.5);
       frete1.calcularFrete();
       BoletoFrete boleto1= new BoletoFrete();
       boleto1.gerarBoleto(frete1);
       
       FreteGratis frete2 = new FreteGratis(50, 0.5);
       frete2.calcularFrete();
      
    }
}
