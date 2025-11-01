package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class camaleao extends reptil implements corredor, predador {

    public camaleao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": (silêncio enquanto muda de cor)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma mosca.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " anda devagar, camuflado nas folhas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " caça insetos com sua língua rápida.");
    }
}