/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.geo.clases;

import paquetes.geo.interfaces.Punto;

/**
 *
 * @author hal
 */
public class PuntoGeografico implements Punto {
    
    private final double elevacion;
    private final double latitud;
    private final double longitud;
    private String descripcion;
    
    public PuntoGeografico(double el, double lat, double lon, String desc) {
        elevacion = el;
        latitud = lat;
        longitud = lon;
        descripcion = desc;
    }

    @Override
    public double getElevacion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return elevacion;
    }

    @Override
    public double getLatitud() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return latitud;
    }

    @Override
    public double getLongitud() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return longitud;
    }

    @Override
    public String getDescripcion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return descripcion;
    }
    @Override
    public void setDescripcion(String newDescripcion) {
        descripcion = newDescripcion;
    }
    
}
