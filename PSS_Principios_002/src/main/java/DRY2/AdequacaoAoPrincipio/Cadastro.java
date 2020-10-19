/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY2.AdequacaoAoPrincipio;

import DRY2.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class Cadastro {
   private String nome;
   private String cpf;
   private String senha;
   private String email;
   private String mensagemConfirmacao;
  
   public void efetuarCadastro(String nome, String cpf, String senha,String email ,EnviaEmail enviaEmail) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.email=email;
        enviaEmail.enviarEmail("para confirmar o email clique no link", email);
    }
   
   
}
