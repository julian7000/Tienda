/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Producto {
    int cod;
    String desc;
    double precio;

    public Producto(int cod, String desc, double precio) {
        this.cod = cod;
        this.desc = desc;
        this.precio = precio;
    }
    public String toString(){
        return null;
    }
    public double calcularTotal(){
        return 0;
    }
}
