/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lima;

/**
 *
 * @author Mus
 */
public class PreferredCustomerDemo {
    public static void main(String[] args){
        PreferredCustomer preferredCustomer = new PreferredCustomer("Ibrahim Romadhon", "666 Kediri", "999-5555", "006", true , 1000);
        System.out.println(preferredCustomer.toString());
    }
}