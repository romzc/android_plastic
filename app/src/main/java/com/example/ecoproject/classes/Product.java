package com.example.ecoproject.classes;

public class Product {
    private String name;
    private float peso; // gramos.
    private short cantidad;

    public Product(String name,float peso, short cantidad ) {
        this.cantidad = cantidad;
        this.name = name;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public float getPeso() {
        return peso;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }
}
