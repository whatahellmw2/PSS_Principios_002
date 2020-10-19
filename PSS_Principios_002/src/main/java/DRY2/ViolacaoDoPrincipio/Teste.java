/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY2.ViolacaoDoPrincipio;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("SEM principio DRY");
        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("joao@hotmail.com");
        Cadastro cadastro = new Cadastro();
        cadastro.efetuarCadastro("joao", "2131", "kha123");
        cadastro.enviarEmail("para confirmar o email clique no link", "joao@gmail.com");
        
        Promocao promocao = new Promocao("Camera 4k por R$ 999,99");
        promocao.enviarPromocao(destinatarios);
        
    }
    
}
