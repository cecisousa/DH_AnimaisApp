package br.com.digitalhouse.dh_animaisapp.model;

public class Animais {
    private String nome;
    private int imagem;

    public Animais () {

    }

    public Animais(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
