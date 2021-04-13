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
class Customer extends Person {
    String customerNumber;
    boolean mailingList;

    //Constructors
    public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean mailingList){
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    //"setCustomerNumber" stores the parameter value "customerNumber"
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }
    //"setMailOnOff" stores the parameter value for "mailingList"
    public void setMailOnOff(boolean mailingList){
        this.mailingList = mailingList;
    }
    //"getMailOnOff" returns the parameter value "mailingList"
    public String getMailOnOff()
    {
    if(mailingList)
        return "Yes";
    else
    return "No";
    }
    //"getCustomerNumber" returns the parameter value "customerNumber"
    public String getCustomerNumber(){
        return customerNumber;
    }
    public String toString(){
        String customer = super.toString() + "\nCustomer Number: "
                + getCustomerNumber() + "\nCustomer MailList: " +
                getMailOnOff();
        return customer;
    }
}
