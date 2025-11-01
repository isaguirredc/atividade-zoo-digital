package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class enguia extends peixe implements nadador, predador {

    public enguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": *zapt!* (descarga elétrica)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos peixes depois de paralisá-los.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " desliza entre as águas turvas do rio.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " usa eletricidade para caçar presas.");
    }
}