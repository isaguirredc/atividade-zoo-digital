package br.edu.atitus.isadora_aguirre.zoo_digital.animais;

public abstract class animal {
    private String nome;
    private int idade;
    private static int contador = 0;

    public animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();
    public abstract void comer();

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public static int getContador() { return contador; }
}
