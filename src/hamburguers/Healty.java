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
public class Healty extends Normal {
    
    //el tipo de pan es invariable
    public Healty(String meat, double price) {
        super("brown rye", meat, price);
    }
    
    //inutiliza setBread
    @Override
    public void setBread(String bread) {
        System.out.println("El tipo de pan es invariable");
    }
    
    @Override
    public boolean addComplement (Ingrediente ing){
        //aqui el maximo son 6
        if(this.complements.size() < 6){
            this.complements.add(ing.getNombre());
            this.price = this.price + ing.getPrice();
            return true;
        }else{
            System.out.println("Se ha llegado al numero maximo de complementos");
            return false;
        }
    }
}
