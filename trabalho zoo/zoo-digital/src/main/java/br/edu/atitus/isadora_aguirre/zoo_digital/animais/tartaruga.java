package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class tartaruga extends reptil implements nadador {

    public tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": eeeeeeh");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas e ervas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " nada calmamente entre as algas marinhas.");
    }
}