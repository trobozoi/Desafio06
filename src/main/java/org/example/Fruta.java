package org.example;

public class Fruta {
    String nome;
    int tonelada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTonelada() {
        return tonelada;
    }

    public void setTonelada(int tonelada) {
        this.tonelada = tonelada;
    }

    public Fruta(String nome, int tonelada) {
        this.nome = nome;
        this.tonelada = tonelada;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", tonelada=" + tonelada +
                '}';
    }
}
