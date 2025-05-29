package com.tecjerez.innovtc;

public class itemVid {
    String titulo;
    String descripcion;
    int img;
    String vid;

    public itemVid(String titulo, String descripcion, int img, String vid) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
        this.vid = vid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
