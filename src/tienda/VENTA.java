/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.time.LocalDate;
import java.util.ArrayList;


public class VENTA {
    private int nroTactil;
    private static int cantVentas;
    private LocalDate fecha;
    private CLIENTE cliente;
    private double total;
    ArrayList<PRODUCTO> listprod = new ArrayList<PRODUCTO>();

    public VENTA(int nroTactil, LocalDate fecha, CLIENTE cliente, double total) {
        this.nroTactil = nroTactil;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
    }

    public int getNroTactil() {
        return nroTactil;
    }

    public void setNroTactil(int nroTactil) {
        this.nroTactil = nroTactil;
    }

    public static int getCantVentas() {
        return cantVentas;
    }

    public static void setCantVentas(int cantVentas) {
        VENTA.cantVentas = cantVentas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public CLIENTE getCliente() {
        return cliente;
    }

    public void setCliente(CLIENTE cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<PRODUCTO> getListprod() {
        return listprod;
    }

    public void setListprod(ArrayList<PRODUCTO> listprod) {
        this.listprod = listprod;
    }

    
    public double calcularTotal(){
        for (PRODUCTO a: listprod){
            total+= a.cacularTotal(); 
        }
        return total;
        
    }
    public void emitirFactura(){
        System.out.println("Descripcion de la compra:  \n ");
        for (PRODUCTO a: listprod){
            a.toString();
        }
        System.out.println("Precio final: "+calcularTotal());
    }
    
}




