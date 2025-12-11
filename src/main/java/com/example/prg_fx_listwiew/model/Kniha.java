package com.example.prg_fx_listwiew.model;

public class Kniha {

    private String titul;
    private String autor;
    private int rokVydani;

    public Kniha(String titul, String autor, int rokVydani) {
        this.titul = titul;
        this.autor = autor;
        this.rokVydani = rokVydani;
    }


    public String toString() {
        return titul /* + " " + autor + " " + rokVydani */;
    }







    public String getTitul() {
        return titul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }
}
