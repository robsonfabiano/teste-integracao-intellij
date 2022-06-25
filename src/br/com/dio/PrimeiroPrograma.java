package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato1 = new Gato();
        Livros livro = new Livros("O problema dos três copos", 300);


        int a = 2;
        int b = 3;

        System.out.println("Hello World!" + (a + b));

        System.out.println(gato1);
        System.out.println(livro);
    }

}

class Livros {
    private String nome;
    private Integer npag;

    public Livros() {
    }

    public Livros(String nome, Integer npag) {
        super();
        this.nome = nome;
        this.npag = npag;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}
