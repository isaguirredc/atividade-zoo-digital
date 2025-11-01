package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class flamingo extends ave implements nadador, voador {

    public flamingo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": honk honk!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está filtrando algas e pequenos crustáceos na água.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " nada graciosamente no lago cor-de-rosa.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " voa em grupo migrando para o norte.");
    }
}