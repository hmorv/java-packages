/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.transporte;

import java.util.ArrayList;
import paquetes.paquete.Paquete;

/**
 *
 * @author hal
 */
public abstract class TransporteTerrestre implements Transporte{
    private int autonomia;
    private int capacidad;
    private ArrayList<Paquete> carga = new ArrayList<Paquete>();
    private int combustible;
    private float kilometraje;
    private String matricula;
    private float velocidad;
    
    public TransporteTerrestre(int autonomia, int capacidad, ArrayList<Paquete> carga, int combustible, float kilometraje, String matricula, float velocidad) {
        this.autonomia = autonomia;
        this.capacidad = capacidad;
        this.carga = carga;
        this.combustible = combustible;
        this.kilometraje = kilometraje;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }
    
    public abstract void repostar(int combustible);
    public abstract void arrancar();
    public abstract void estacionar();
    public abstract void cargar(ArrayList<Paquete> carga);
    public abstract void descargar(Paquete paquete);
    
    public int getAutonomia() {
        return autonomia;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public ArrayList<Paquete> getCarga() {
        return carga;
    }
    public void addCarga(ArrayList<Paquete> carga) {
        for(int i = 0; i < carga.size(); i++) {
            this.carga.add(carga.get(i));
        }
    }
    public void vaciarCarga() {
        carga.clear();
    }
    public Paquete getPaquete(int id) {
        return this.carga.get(id);
    }
    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(float newCombustible) {
        combustible += newCombustible;
    }
    public float getKilometraje() {
        return kilometraje;
    }
    public String getMatricula() {
        return matricula;
    }
    public float getVelocidad() {
        return velocidad;
    }
    
}
