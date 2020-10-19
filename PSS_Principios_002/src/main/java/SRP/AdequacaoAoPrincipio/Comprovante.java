/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP.AdequacaoAoPrincipio;

/**
 *
 * @author Thiago
 */
public class Comprovante {
     public void emitirComprovante(Cliente cliente, PassagemAerea passagem){
       System.out.println("\nPagamento confirmado");
       System.out.println("Passageiro: "+cliente.getNome());
       System.err.println("Destino: "+passagem.getDestino());
   }
}
