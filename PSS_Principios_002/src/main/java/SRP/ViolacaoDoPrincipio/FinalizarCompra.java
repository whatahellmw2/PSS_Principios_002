/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class FinalizarCompra {
   private Cliente cliente;
   private PassagemAerea passagem;

    public FinalizarCompra(Cliente cliente, PassagemAerea passagem) {
        this.cliente = cliente;
        this.passagem = passagem;
    }
   
   public void verificarSaldo(){
       if(cliente.getSaldo()>=passagem.getValor()){
           this.debitarConta();
           this.emitirComprovante();
       }else{
           System.out.println("\nPassageiro: "+this.cliente.getNome());
           System.out.println("Saldo Insuficiente");
       }
   } 
   public void debitarConta(){
       cliente.setSaldo(cliente.getSaldo()-passagem.getValor());
   }
   public void emitirComprovante(){
       System.out.println("\nPagamento confirmado");
       System.out.println("Passageiro: "+this.cliente.getNome());
       System.err.println("Destino: "+this.passagem.getDestino());
   }
}
