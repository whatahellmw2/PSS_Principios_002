/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOD.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Jornaleiro {
    private double totalCobranca;
    private double totalRecebido;
    private Cliente cliente;

    public Jornaleiro(Cliente cliente, double cobranca) {
        this.cliente = cliente;
        this.totalCobranca=cobranca;
        
    }
    
    public void coletarPagamento(){
        if(this.cliente.getCarteira().getValor()>=this.totalCobranca){
            cliente.getCarteira().subtraiValor(totalCobranca);
            totalRecebido += totalCobranca;
        }else{
            System.out.println("Cliente sem dinheiro");
        }
    }
}
