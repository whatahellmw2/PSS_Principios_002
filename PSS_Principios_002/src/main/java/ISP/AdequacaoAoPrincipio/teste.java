/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISP.AdequacaoAoPrincipio;

import ISP.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class teste {
    public static void main(String args[]){
        System.out.println("Com principio ISP");
        IAvesVoadoras papagaioBrasileiro = new Papagaio();
        IAvesNadadoras pinguimImperador = new Pinguim();
        
        pinguimImperador.nadar();
        
        
        
        papagaioBrasileiro.voar();
    }
}
