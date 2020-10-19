/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY.ViolacaoDoPrincipio;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Historico {
    private ArrayList<Operacao> operacoes;

    public Historico() {
        this.operacoes = new ArrayList<>();
    }
    public void addOperacao(Operacao operacao){
        operacoes.add(operacao);
    }
    public void salvarDadosTxt(){
        System.out.println("Salvo os dados em txt");
        for(Operacao d: operacoes){
            System.out.println(d.toString());
        }
    }
    public void converteDadosParaPdf(){
        System.out.println("Metodo que converte dados txt para pdf");
    }
    
}
