/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRP.AdequacaoAoPrincipip;

import CRP.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;
    private double bonus;
    private IProcessadoraBonus processaBonus;
    public Funcionario(String nome, String matricula, double salario, IProcessadoraBonus processaBonus) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.processaBonus=processaBonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
    public void calculaBonus(){
        this.bonus=this.processaBonus.calculaBonus();
    }
    public void imprimeFuncionario(){
        System.out.println("\nnome: "+this.nome);
        System.out.println("matricula: "+this.matricula);
        System.out.println("salario: "+this.salario);
        System.out.println("Bonus: "+this.bonus);
    }
}
