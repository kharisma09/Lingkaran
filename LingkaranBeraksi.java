/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkaran;

/**
 *
 * @author user
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        double r = 11.78;

        Lingkaran lingkaran = new Lingkaran();
        double luas = lingkaran.hitungLuas(r);
        System.out.println("Luas lingkaran (pecahan): " + luas);              
        System.out.println("Luas lingkaran (bilangan bulat): " + (int) luas); 
        System.out.println("Luas lingkaran (pembulatan): " + Math.round(luas));    
    }
    
}
