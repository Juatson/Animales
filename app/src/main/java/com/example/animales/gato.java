package com.example.animales;

public class gato {
    Integer Edad;
    String Raza;
    String Genero;
    String Color;
    Double Peso;
    Double Altura;
    String Nombre;

    public gato(Integer edad, String raza, String genero, String color, Double peso, Double altura, String nombre) {
        Edad = edad;
        Raza = raza;
        Genero = genero;
        Color = color;
        Peso = peso;
        Altura = altura;
        Nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public String getGenero() {
        return Genero;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public double calculartamano() {
        return (this.Altura*this.Peso);   }
}

