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
public class Faxineiro extends Funcionario{
    
    private double bonus;

    public Faxineiro(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }
    @Override
    public void calculaBonus(){
       super.setBonus(180);
    }
}
