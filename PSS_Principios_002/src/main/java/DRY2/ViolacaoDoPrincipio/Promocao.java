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
public class Promocao {
    
    private String menssagemPromocao;
    public Promocao(String menssagem){
        this.menssagemPromocao=menssagem;
    }
    public void enviarPromocao(ArrayList<String> destinatarios){
        for(String s: destinatarios){
            enviarEmail(this.menssagemPromocao, s);
        }
    }
    private void enviarEmail(String mensagem, String email){
       System.out.println("Um codigo para enviar email");
   }
}
