package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class crocodilo extends reptil implements nadador, predador {

    public crocodilo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": grrrrrr!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando um peixe grande.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " se move silenciosamente na água.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando próximo à margem do rio.");
    }
}