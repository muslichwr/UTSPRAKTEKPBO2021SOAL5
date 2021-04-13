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
class Person {
    //Members of the class person
    String name;
    String address;
    String telephoneNumber;

    //Constructors for the data members
    public Person(String name, String address, String telephoneNumber){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
    //"setName" stores the parameter "name"
    public void setName(String name){
        this.name = name;
    }
    //"setAddress" stores the parameter "address"
    public void setAddress(String address){
        this.address = address;
    }
    //"setTelephoneNumber" stores the parameter value for "telephoneNumber"
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    //"getName" returns the parameter value "name"
    public String getName(){
        return name;
    }
    //"getAddress" returns the parameter value "address"
    public String getAddress(){
        return address;
    }
    //"getPhoneNumber" returns the parameter value "telephoneNumber"
    public String getPhoneNumber(){
        return telephoneNumber;
    }
    public String toString(){
        String person = "Name: " + getName() + "\nAddress: " + getAddress() +
                "\nPhoneNumber: " + getPhoneNumber();
        return person;
    }

}