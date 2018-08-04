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
public class Paquete implements BasePaquete {
    private Etiqueta etiqueta;
    private float peso;
    private int dimensiones;
    private Fragilidad fragilidad;

    public Paquete(Etiqueta etiqueta, float peso, int dimensiones, Fragilidad fragilidad ) {
        this.etiqueta = etiqueta;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.fragilidad = fragilidad;
        
    }
    
    public Etiqueta getEtiqueta() {
        return etiqueta;
    }
    public float getPeso() {
        return peso;
    }
    public int getDimensiones() {
        return dimensiones;
    }
    public Fragilidad getFragilidad() {
        return fragilidad;
    }
}
