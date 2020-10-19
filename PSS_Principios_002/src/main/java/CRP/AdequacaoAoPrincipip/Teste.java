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
public class Teste {
    public static void main(String args[]){
        System.out.println("COM principio CRP\n");
         
        
        
        Funcionario manu= new Programador("manu", "5247",3000, new BonusProgramador());
        Funcionario cleber = new Faxineiro("cleber", "2214", 1500, new BonusFaxineiro());
        
        manu.calculaBonus();
        cleber.calculaBonus();
        
        manu.imprimeFuncionario();
        cleber.imprimeFuncionario();
    }
}
