/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.geo.interfaces;

import java.util.ArrayList;
import paquetes.geo.clases.PuntoGeografico;
import paquetes.geo.clases.TipoRuta;

/**
 *
 * @author hal
 */
public interface Ruta {
    PuntoGeografico getInicioRuta();
    PuntoGeografico getFinRuta();
    double calcularDistanciaRuta();
    ArrayList<PuntoGeografico> getRuta();
    PuntoGeografico getPuntoActualRuta();
    TipoRuta getTipoRuta();
}
