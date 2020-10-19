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
public class Login {
    private IUsuario usuario;
    
    public void efetuarLogin(IUsuario usuario){
        this.usuario=usuario;
        this.usuario.setDireitos();
    }
   
}
