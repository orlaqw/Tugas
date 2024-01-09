package BuAul.PBO.Enkasulapsi.ModulEnkasulapsi.OOP;

public class EncapSiswa {
    private String name;
    private String address;
    private int age;
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAge (int newAge){
        age=newAge;
    }
    public void setName (String newName){
        name=newName;
    }
    public void setAddress (String newAddress){
        address=newAddress;
    }
}
