/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.geo.interfaces;

/**
 *
 * @author hal
 */
public interface Punto {
    double getElevacion();
    double getLatitud();
    double getLongitud();
    String getDescripcion();
    void setDescripcion(String newDescripcion);
}
