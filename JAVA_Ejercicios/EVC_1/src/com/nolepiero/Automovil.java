package com.nolepiero;

public class Automovil {
    String Marca;
    String Año;
    String Modelo;
    String CapacidadLlenado;
    String KMH;
    String Puertas;

    public Automovil() {
    }

    public Automovil(String marca, String año, String modelo, String capacidadLlenado, String KMH, String Puertas) {
        Marca = marca;
        Año = año;
        Modelo = modelo;
        CapacidadLlenado = capacidadLlenado;
        this.KMH = KMH;
        this.Puertas = Puertas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String año) {
        Año = año;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCapacidadLlenado() {
        return CapacidadLlenado;
    }

    public void setCapacidadLlenado(String capacidadLlenado) {
        CapacidadLlenado = capacidadLlenado;
    }

    public String getKMH() {
        return KMH;
    }

    public void setKMH(String KMH) {
        this.KMH = KMH;
    }

    public String getPuertas() {
        return Puertas;
    }

    public void setPuertas(String Puertas) {
        this.Puertas = Puertas;
    }

    @Override
    public String toString() {
        return "Automovil : " +
                "Marca='" + Marca + '\'' +
                ", Año='" + Año + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", CapacidadLlenado='" + CapacidadLlenado + '\'' +
                ", KMH='" + KMH + '\'' +
                ", Puertas='" + Puertas + '\'';
    }
}
