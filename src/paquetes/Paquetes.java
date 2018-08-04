/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes;

import paquetes.geo.clases.RutaTerrestre;
import paquetes.geo.clases.PuntoGeografico;
import paquetes.paquete.Fragilidad;
import paquetes.paquete.Paquete;
import paquetes.paquete.Etiqueta;
import java.util.ArrayList;

/**
 *
 * @author hal
 */
public class Paquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Etiqueta et1 = new Etiqueta(1, "PMI", "MAD", "50x15x12");
        Etiqueta et2 = new Etiqueta(2, "PMI", "BCN", "85x24x10");
                
        Paquete pq1 = new Paquete(et1, 50.6f, 105, Fragilidad.POCOFRAGIL);
        Paquete pq2 = new Paquete(et2, 10.12f, 124, Fragilidad.MUYFRAGIL);
        
        System.out.println("Fragilidad: " +pq1.getFragilidad());
        System.out.format("Peso: %f \n", pq1.getPeso());
        System.out.format("Dimensiones: %d \n", pq1.getDimensiones());
        
        ArrayList<Paquete> load = new ArrayList<Paquete>();
        load.add(pq1);
        load.add(pq2);*/
        
        PuntoGeografico p1 = new PuntoGeografico(39.5655, 2.23265, 23, "Palma");
        PuntoGeografico p2 = new PuntoGeografico(39.0211, 2.452, 41, "Manacor");
        PuntoGeografico p3 = new PuntoGeografico(39.0001, 2.68, 16, "Santanyí");
        
        System.out.format("Latitud: %f", p1.getLatitud());
        System.out.format("\nLongitud: %f", p1.getLongitud());
        System.out.format("\nElevacion: %f", p1.getElevacion());
        System.out.println("\nDescripcion: " + p1.getDescripcion());
        
        ArrayList<PuntoGeografico> listaPuntos = new ArrayList<>();
        listaPuntos.add(p1);listaPuntos.add(p2);listaPuntos.add(p3);
        
        RutaTerrestre ruta1 = new RutaTerrestre(listaPuntos);
        
        PuntoGeografico pi = ruta1.getInicioRuta();
        PuntoGeografico pf = ruta1.getFinRuta();
        System.out.println(pi.getDescripcion());
        System.out.println(pf.getDescripcion());
        
        //Camion c1 = new Camion(100, 500, load, 200, 5874);
        
        //System.out.println(c1.getCombustible());
    }
    
}
