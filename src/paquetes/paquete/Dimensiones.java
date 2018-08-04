/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.paquete;

/**
 *
 * @author hal
 */
public class Dimensiones {
    private int alto;
    private int ancho;
    private int profundidad;
    private int peso;
    
    
    public Dimensiones(int alto, int ancho, int profundidad, int peso) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.peso = peso;

    }
    
    int getAlto() {
        return alto;
    }
    int getAncho() {
        return ancho;
    }
    int getProfundidad() {
        return profundidad;
    }
    int getPeso() {
        return peso;
    }
    
    void setAlto(int alto) {
        this.alto = alto;
    }
    void setAncho(int ancho) {
        this.ancho = ancho;
    }
    void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    void setPeso(int peso) {
        this.peso = peso;
    }
    
    float getVolumen() {
        return ancho * alto * profundidad;
    }
    float getArea() {
        return ancho * alto;
    }
    
}
