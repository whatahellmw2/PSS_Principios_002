/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY2.ViolacaoDoPrincipio;

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
   
   public void efetuarCadastro(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
   
   public void enviarEmail(String mensagem, String email){
       System.out.println("Um codigo para enviar email");
   }
}
