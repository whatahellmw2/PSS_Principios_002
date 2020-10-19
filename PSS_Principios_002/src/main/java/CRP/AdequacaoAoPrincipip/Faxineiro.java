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
public class Faxineiro extends Funcionario{
    
    public Faxineiro(String nome, String matricula, double salario, IProcessadoraBonus processaBonus) {
        super(nome, matricula, salario, processaBonus);
    }
    
    
}
