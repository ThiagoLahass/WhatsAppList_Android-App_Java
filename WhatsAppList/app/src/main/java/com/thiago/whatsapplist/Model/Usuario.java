package com.thiago.whatsapplist.Model;

public class Usuario {

    private int foto;
    private String nome;
    private String mensagem;

    public Usuario(int foto, String nome, String mensagem) {
        this.foto = foto;
        this.nome = nome;
        this.mensagem = mensagem;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
