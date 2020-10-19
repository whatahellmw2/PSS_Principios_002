/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class teste {
    public static void main(String args[]){
        System.out.println("SEM principio ISP");
        IAve papagaioBrasileiro = new Papagaio();
        IAve pinguimImperador = new Pinguim();
        
        pinguimImperador.nadar();
        pinguimImperador.voar();
        
        papagaioBrasileiro.nadar();
        papagaioBrasileiro.voar();
    }
}
