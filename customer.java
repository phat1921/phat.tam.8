/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttest;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class customer {
    private String FullName;
    private String Address;
    private int Phone;
    private float Price;
    private float Discount;
    private float Tax;

    public customer(String FullName, String Address, int Phone,
            float Price, float Discount, float Tax) {
        this.FullName = FullName;
        this.Address = Address;
        this.Phone = Phone;
        this.Price = Price;
        this.Discount = Discount;
    }

    customer() {
 
    }
    
    public String getFullName(){
        return FullName;
    }
    
    public void setFullName(String FullName){
        this.FullName = FullName;
    }
    
    public String getAddress(){
        return Address;
    }
           
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    public int getPhone(){
        return Phone;
    }
    
    public void setPhone(int Phone){
        this.Phone = Phone;
    }
    
    public float getPrice(){
        return Price;
    }
    
    public void setPrice(float Price){
        this.Price = Price;
    }
    
    public float getDiscount(){
        return Discount;
    }
    
    public void setDiscount(float Discount){
        this.Discount = Discount;
    }
    
    public float getTax(){
        return Tax;
    }
    
    public void setTax(float Tax){
        this.Tax = Tax;
    }   


    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten:");
        FullName = input.nextLine();
        
        System.out.println("Nhap dia chi:");
        Address = input.nextLine();
        
        System.out.println("Nhap sdt:");
        Phone = input.nextInt();
        
        System.out.println("Nhap gia ban dau:");
        Price = input.nextFloat();
        
        System.out.println("Nhap % giam:");
        Discount = input.nextFloat();
        
        System.out.println("Nhap % thue:");
        Tax = input.nextFloat();
        
    }



    public  void display(){
        System.out.println("-----------");
        System.out.println("\tTen:" + FullName);
        System.out.println("\tDia chi:" + Address);
        System.out.println("\tSo dien thoai:" + Phone);
        System.out.println("\tGia:" + Price +"VND");
        System.out.println("\tGiam gia:" + Discount +"%");
        System.out.println("\tThue:" + Tax + "%");
        System.out.println("\tTien phai thanh toan:" + (Price - Discount + Tax * Price) + "VND");
    }
}
