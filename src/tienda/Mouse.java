/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author ET36
 */
public class Mouse extends Producto{
    boolean macro;
    public Mouse(boolean macro, int cod, String desc, double precio) {
        super(cod, desc, precio);
        this.macro = macro;
    }
    public String toString(){
        System.out.println("Producto: Mouse\n"
                + "Macro: "+macro+"\n"
                        + "cod: "+ cod+"\n"
                                + "desc: "+desc+"\n"
                                        + "precio: "+calcularTotal() );
        return null;
    }
    public double calcularTotal(){
        precio = 5000;
        if(macro == true){
            precio = precio + 1000;
        }
        return precio;
    }
}
