/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP.AdequacaoAoPrincipio;

import SRP.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class teste {
   public static void main(String args[]){
       System.out.println("COM Pricipio SRP\n");
               
       Cliente cliente1= new Cliente("joão", 1000);
       Cliente cliente2= new Cliente("maria", 520);
       PassagemAerea passagem1= new PassagemAerea("São Paulo", 599);
       
       FinalizarCompra compra1= new FinalizarCompra(cliente1, passagem1);
       compra1.verificarSaldo();
       
       
       FinalizarCompra compra2= new FinalizarCompra(cliente2, passagem1);
       compra2.verificarSaldo();
       
       
   } 
}
