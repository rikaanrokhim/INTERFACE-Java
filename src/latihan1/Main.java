/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author lenovo
 */
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
//        instance of class
        Kalkulator k = new Kalkulator();
        
//        input
        System.out.print("Masukkan bilangan pertama : ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan bilangan kedua : ");
        double b = Double.parseDouble(br.readLine());
        
        k = new Kalkulator(a,b);
        
        System.out.println();
        
//        output
        System.out.print("Hasil Penjumlahan : ");
        k.Penjumlahan();
        System.out.print("Hasil Pengurangan : ");
        k.Pengurangan();
        System.out.println("Hasil perkalian = " + k.Perkalian());
        System.out.println("Hasil pembagian = " + k.Pembagian());
    }
}
