/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab4.questao1;

/**
 *
 * @author fabiola
 */
public class PavaoAveAdaptor implements Ave {
    
    Pavao pavao;
    
    public PavaoAveAdaptor(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavao nao voa");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
    
}
