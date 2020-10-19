/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCP.AdequacaoAoPrincipio;

import OCP.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class teste {
    public static void main(String args[]){
       System.out.println("COM principio OCP\n");
       IUsuario u1= new Cliente("joao");
       IUsuario u2= new ClientePrime("maria");

       Login login1=new Login();
       login1.efetuarLogin(u1);
       
       Login login2=new Login();
       login2.efetuarLogin(u2);
       
       u1.imprimeUsuario();
       u2.imprimeUsuario();
    }
   
}
