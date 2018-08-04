/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.transporte;

import java.util.ArrayList;
import paquetes.geo.interfaces.Ruta;
import paquetes.paquete.Paquete;

/**
 *
 * @author hal
 */
public class Camion extends TransporteTerrestre {
    final int MAX_COMBUSTIBLE = 200;
    
    /*private int autonomia;
    private int capacidad;
    private int combustible;
    private float kilometraje;
    private String matricula;
    private int velocidad;
    private ArrayList<Paquete> carga = new ArrayList<Paquete>();*/
    
    private boolean enmarcha;
    
    
    public Camion(int autonomia, int capacidad, ArrayList<Paquete> carga, int combustible, float kilometraje, String matricula, float velocidad) {
        super(autonomia, capacidad, carga, combustible, kilometraje, matricula, velocidad);
        /*this.autonomia = autonomia;
        this.carga = carga;
        this.combustible = combustible;
        this.kilometraje = kilometraje;
        this.velocidad = velocidad;*/
    }
    
    public void repostar(int cantidad) {
        if(cantidad + this.getCombustible() <= MAX_COMBUSTIBLE) {
            this.setCombustible(cantidad);
        } else {
            this.setCombustible(MAX_COMBUSTIBLE);
        }
    }
    
    @Override
    public void arrancar() {
        this.enmarcha = true;
    }
    
    @Override
    public void estacionar() {
        this.enmarcha = false;
    }
    //@Override
    /*public void addCarga(ArrayList<Paquete> items) {
        for(int i = 0; i < items.size(); i++) {
            this.carga.add(items.get(i));
        }
    }*/
    public void descargar() {
        this.carga.vaciarCarga();
    }
    
    private void updateCombustible(int ratio) {
        if(this.getCombustible() > 0) {
            setCombustible(ratio);
        }
        
        if(this.getCombustible() <= 0) {
            this.estacionar();
        }
    }

}
