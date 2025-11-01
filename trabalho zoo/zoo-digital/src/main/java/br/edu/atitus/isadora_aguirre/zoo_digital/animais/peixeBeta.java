package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class peixeBeta extends peixe implements nadador {

    public peixeBeta(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": glub glub *bolhas no aquário*");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos flocos de ração.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " nada exibindo suas nadadeiras coloridas.");
    }
}
