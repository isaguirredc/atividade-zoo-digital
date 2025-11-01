package br.edu.atitus.isadora_aguirre.zoo_digital.animais;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class ornitorrinco extends mamifero implements nadador, predador {

    public ornitorrinco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": *sons de ornitorrinco (ninguém sabe)*");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos e vermes aquáticos.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " nada silenciosamente em um lago.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando vilões… cuidado, Dr. Heinz Doofenshmirtz!");
    }
}