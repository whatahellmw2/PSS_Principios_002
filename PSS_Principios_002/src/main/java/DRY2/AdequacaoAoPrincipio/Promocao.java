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
public class Promocao {
    private EnviaEmail enviaEmail;
    private String menssagemPromocao;
    public Promocao(String menssagem, EnviaEmail enviaEmail){
        this.menssagemPromocao=menssagem;
        this.enviaEmail=enviaEmail;
    }
    public void enviarPromocao(ArrayList<String> destinatarios){
        for(String s: destinatarios){
            this.enviaEmail.enviarEmail(this.menssagemPromocao, s);
        }
    }
   
}
