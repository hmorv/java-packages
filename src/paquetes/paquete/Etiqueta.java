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
public class Etiqueta implements BaseEtiqueta {

    private int id;
    private String origen;
    private String destino;
    private String dimensiones;
    
    public Etiqueta(int id, String origen, String destino, String dimensiones) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.dimensiones = dimensiones;
    }
    
    public int getId() {
        return this.id;
    }
    public String getOrigen() {
        return this.origen;
    }
    public String getDestino() {
        return this.destino;
    }
    public String getDimensiones() {
        return this.dimensiones;
    }
}
