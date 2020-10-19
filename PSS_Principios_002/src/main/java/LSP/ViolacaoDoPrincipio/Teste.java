/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("SEM principio LSP\n");
        
       Frete frete1= new Frete(100,0.5);
       Frete frete2 = new FreteGratis(100, 0.5);
       
       frete1.calcularFrete();
       frete2.calcularFrete();
       
       BoletoFrete boleto1= new BoletoFrete();
       boleto1.gerarBoleto(frete1);
       boleto1.gerarBoleto(frete2);
    }
}
