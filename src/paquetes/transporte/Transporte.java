/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.transporte;

import java.util.ArrayList;
import paquetes.paquete.Paquete;
import paquetes.geo.interfaces.Ruta;
/**
 *
 * @author hal
 */
public interface Transporte {
    
    int getAutonomia();
    int getCapacidadCarga();
    ArrayList<Paquete> getCarga();
    int getCombustible();
    //float getKilometraje();
    //String getMatricula();
    Ruta getRuta();
    //float getVelocidadActual();
    
    //void arrancar();
    //void parar();
    //void repostar(int combustible);
    
    void cargar(ArrayList<Paquete> carga);
    void descargar(Paquete paquete);    
    
}
