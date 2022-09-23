/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author ET36
 */
public class Monitor extends Producto{
    int hz;

    public Monitor(int hz, int cod, String desc, double precio) {
        super(cod, desc, precio);
        this.hz = hz;
    }
    public String toString(){
        System.out.println("Producto: Teclado\n"
                + "Hz: "+hz+"\n"
                        + "cod: "+ cod+"\n"
                                + "desc: "+desc+"\n"
                                        + "precio: "+calcularTotal() );
        return null;
    }
        public double calcularTotal(){
        precio = 50000 + (hz*3);
        return precio;
    }
}
