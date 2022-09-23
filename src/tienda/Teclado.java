/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author ET36
 */
public class Teclado extends Producto{
    boolean mecanico;

    public Teclado(boolean mecanico, int cod, String desc, double precio) {
        super(cod, desc, precio);
        this.mecanico = mecanico;
    }

    
        public String toString(){
        System.out.println("Producto: Teclado\n"
                + "Mecanico: "+mecanico+"\n"
                        + "cod: "+ cod+"\n"
                                + "desc: "+desc+"\n"
                                        + "precio: "+calcularTotal() );
        return null;
    }
        public double calcularTotal(){
        precio = 6000;
        if(mecanico == true){
            precio = precio + 1000;
        }
        return precio;
    }
}
