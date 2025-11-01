package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class dragaodeKomodo extends reptil implements corredor, predador {

    public dragaodeKomodo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": grrrrrr!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando uma carcaça com saliva venenosa.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " corre pesado, perseguindo a presa.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " caça grandes mamíferos com mordida venenosa.");
    }
}