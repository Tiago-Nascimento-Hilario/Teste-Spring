package com.tiago.projeto;

public class Cliente {
    private  String nome;
    private int idade;
    
    public Cliente(){}

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + "]";
    }
    
    
}
