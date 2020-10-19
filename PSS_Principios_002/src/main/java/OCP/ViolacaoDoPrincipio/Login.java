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
public class Login {
    private Usuario usuario;
    
    public void efetuarLogin(Usuario usuario){
        this.usuario=usuario;
        if(this.usuario.getTipo().equals("cliente")){
            this.atribuirDireitosCliente();
        }
        else if(this.usuario.getTipo().equals("prime")){
            this.atribuirDireitosClientePrime();
        } 
    }
   
    public void atribuirDireitosCliente(){
        boolean[] aux = {false,true,false};
        this.usuario.setDireitos(aux);
    }
     public void atribuirDireitosClientePrime(){
        boolean[] aux = {true,true,true};
        this.usuario.setDireitos(aux);
    }
}
