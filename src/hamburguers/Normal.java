/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamburguers;
import java.util.ArrayList;
/**
 *
 * @author osiri
 */
public class Normal {
    //Atributos
    protected String bread;
    protected String meat;
    ArrayList<String> complements = new ArrayList<String>();
    protected double price;
    
    //Inicializador
    public Normal (String bread, String meat, double price){
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    //get and set
    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public ArrayList<String> getComplements() {
        return complements;
    }

    public double getPrice() {
        return price;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
    
    //Metodos
    public boolean addComplement (Ingrediente ing){
        //Checa si el numero de complementos actual es menor a 4
        if(this.complements.size() < 4){
            this.complements.add(ing.getNombre());
            this.price = this.price + ing.getPrice();
            return true;
        }else{
            System.out.println("Se ha llegado al numero maximo de complementos");
            return false;
        }
    }
    
    public boolean removeComplement (Ingrediente ing){
        //Checa si el complemento existe
        if(this.complements.contains(ing.getNombre())){
            this.complements.remove(ing.getNombre());
            this.price = this.price - ing.getPrice();
            return true;
        }else{
            System.out.println("El complemento no se encuentra en la hambuerguesa");
            return false;
        }
    }
}
