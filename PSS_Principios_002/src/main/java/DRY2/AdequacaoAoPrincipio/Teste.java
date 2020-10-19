/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY2.AdequacaoAoPrincipio;

import DRY2.ViolacaoDoPrincipio.*;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Teste {
    //O princípio DRY orienta que não devemos repetir trechos de códigos
    //quando um método é usado por mais de uma classe ele deve ser
    //implementado em uma classe própria para que as outras classes possam
    //utilizar o mesmo método. Não se deve implementá-lo em cada classe que o 
    //utiliza.
    public static void main(String args[]){
        System.out.println("COM principio DRY");
        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("joao@hotmail.com");
        Cadastro cadastro = new Cadastro();
        
        EnviaEmail enviaEmail= new EnviaEmail();
        cadastro.efetuarCadastro("joao", "2131", "kha123","joao@gmail.com",enviaEmail);
        
        
        Promocao promocao = new Promocao("Camera 4k por R$ 999,99",enviaEmail);
        promocao.enviarPromocao(destinatarios);
        
    }
    
}
