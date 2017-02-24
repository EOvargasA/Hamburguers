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
public class Deluxe extends Normal{
    
    public Deluxe(String bread, String meat, double price) {
        super(bread, meat, price);
    }
    
    // se verifica el tipo de complemento
    @Override
    public boolean addComplement (Ingrediente ing){
        if(ing.getType() == "chips" || ing.getType() == "drink"){ 
            if(this.complements.size() < 2){
                this.complements.add(ing.getNombre());
                this.price = this.price + ing.getPrice();
                return true;
            }else{
                System.out.println("Se ha llegado al numero maximo de complementos");
                return false;
            }
        }else{
            System.out.println("Complemento no valido");
            return false;
        }
    }
    
    @Override
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
