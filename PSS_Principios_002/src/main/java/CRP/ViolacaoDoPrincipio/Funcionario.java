/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;
    private double bonus;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
    public void calculaBonus(){
        this.bonus=100;
    }
    public void imprimeFuncionario(){
        System.out.println("\nnome: "+this.nome);
        System.out.println("matricula: "+this.matricula);
        System.out.println("salario: "+this.salario);
        System.out.println("Bonus: "+this.bonus);
    }
}
