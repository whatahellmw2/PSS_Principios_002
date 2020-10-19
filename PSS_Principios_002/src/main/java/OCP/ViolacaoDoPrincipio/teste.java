/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class teste {
    public static void main(String args[]){
       System.out.println("Sem principio OCP\n");
       Usuario u1= new Usuario("joao", "prime");
       Usuario u2= new Usuario("maria","cliente");

       Login login1=new Login();
       login1.efetuarLogin(u1);
       
       Login login2=new Login();
       login2.efetuarLogin(u2);
       
       u1.imprimeUsuario();
       u2.imprimeUsuario();
    }
   
}
