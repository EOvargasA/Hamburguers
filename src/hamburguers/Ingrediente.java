/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamburguers;

/**
 *
 * @author osiri
 */
public class Ingrediente {
    private String nombre;
    private double price;
    private String type;

    public Ingrediente(String nombre, double price, String type) {
        this.nombre = nombre;
        this.price = price;
        if (type == "chips" || type == "drink" || type == "ingredient"){
            this.type = type;
        }else{
            System.out.println("Tipo no valido, poniendo ingrediente");
            this.type = "ingredient";
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
