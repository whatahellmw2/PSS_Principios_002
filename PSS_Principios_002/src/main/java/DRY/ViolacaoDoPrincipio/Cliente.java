/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Cliente {
    private String nome;
    private String CPF;
    private String RG;
    private double saldo;
    private Historico historico;

    public Cliente(String nome, String CPF, String RG, double saldo, Historico historico) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.saldo = saldo;
        this.historico = historico;
    }
    public void salvarDadosTxt(){
        System.out.println("Salvo os dados em txt");
        System.out.println("nome: "+this.nome);
        System.out.println("Cpf: "+this.CPF);
        System.out.println("RG: "+this.RG);
        System.out.println("saldo: "+this.saldo);

    }
    public void converteDadosParaPdf(){
        System.out.println("Metodo que converte dados txt para pdf");
    }
}
