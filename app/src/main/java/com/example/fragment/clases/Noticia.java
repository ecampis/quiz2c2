package com.example.fragment.clases;

public class Noticia {

    private String titulo;
    private String descripcion;
    private String imagen;

    public Noticia (String imagen, String titulo, String descripcion){
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
