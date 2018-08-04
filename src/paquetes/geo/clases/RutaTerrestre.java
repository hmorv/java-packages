/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.geo.clases;

import paquetes.geo.interfaces.Ruta;
import java.util.ArrayList;

/**
 *
 * @author hal
 */
public class RutaTerrestre implements Ruta {
    
    public RutaTerrestre(ArrayList<PuntoGeografico> puntos) {
        for(int i = 0; i < puntos.size(); i++) {
            ruta.add(puntos.get(i));
        }
    }
    
    ArrayList<PuntoGeografico> ruta = new ArrayList<>();

    @Override
    public PuntoGeografico getInicioRuta() {
        return ruta.get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PuntoGeografico getFinRuta() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ruta.get(ruta.size() - 1);
    }

    @Override
    public double calcularDistanciaRuta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PuntoGeografico> getRuta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PuntoGeografico getPuntoActualRuta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoRuta getTipoRuta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
