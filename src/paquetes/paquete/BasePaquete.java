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
public interface BasePaquete {
    public Etiqueta getEtiqueta();
    public float getPeso();
    public int getDimensiones();
    public Fragilidad getFragilidad();
}
