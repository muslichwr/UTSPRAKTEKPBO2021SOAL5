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
class PreferredCustomer extends Customer {

    double purchase;
    double discount;

    //Constructor
    public PreferredCustomer(String name, String address, String telephoneNumber,
                             String customerNumber, boolean mailingList, double purchase)
    {
        super(name, address, telephoneNumber, customerNumber, mailingList);
        this.purchase = purchase;

        //"setDiscount" method
        if(purchase >= 2000)
            setDiscount(0.10);
        else if(purchase >= 1500)
            setDiscount(0.07);
        else if(purchase >= 1000)
            setDiscount(6);
        else 
            setDiscount(0.05);
    }
    //"setPurchase" stores the parameter value "setPurchase"
    public void setPurchase(double purchase){
        this.purchase = purchase;
    }
    //"setPurchase" stores the parameter value "setPurchase"
    private void setDiscount(double discount){
        this.discount = discount;
    }
    //"getPurchase" returns purchase value
    public double getPurchase(){
        return purchase;
    }
    //"getDiscount" returns discount value
    public double getDiscount(){
        return discount;
    }
    public String toString(){
        String preferredCustomer = super.toString() + "\nPurchase "
                + getPurchase() + "\nDiscount " + getDiscount();
        return preferredCustomer;
    }
}