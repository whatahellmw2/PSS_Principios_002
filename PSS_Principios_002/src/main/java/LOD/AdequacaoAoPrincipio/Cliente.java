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
public class Cliente {
    private String nome;
    private Carteira carteira;

    public Cliente(String nome, Carteira carteira) {
        this.nome = nome;
        this.carteira=carteira;
    }

    public Carteira getCarteira() {
        return carteira;
    }
    public void imprimeCliente(){
        System.out.println("nome: "+ this.nome);
        System.out.println("valor em carteira: "+ this.carteira.getValor());
    }
    public double pagarJornaleiro(double cobranca){
        if(carteira.getValor()>=cobranca){
            carteira.subtraiValor(cobranca);
            return cobranca;
        }else{
            return 0;
        }
        
    }
}
