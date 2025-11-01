package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class morcego extends mamifero implements voador, predador {
    
	public morcego(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": *gritinhos agudos*");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo frutas e insetos.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " voa à noite usando ecolocalização.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando insetos no ar.");
    }
}