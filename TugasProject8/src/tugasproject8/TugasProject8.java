/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject8;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //TUGAS SWITCH CASE
        int pesanan,jumlah_pesanan,total,harga = 0;
        String nama_pesanan = null;
        //string digunakan untuk variabel nama
                Scanner input=new Scanner (System.in);
        
        System.out.println("Menu");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Air Mineral");
        
        System.out.print("Pesanan : ");
        pesanan=input.nextInt();
        
        System.out.print("Jumlah Pesanan : ");
        jumlah_pesanan=input.nextInt();
        
        switch(pesanan){
            case 1:
                nama_pesanan="kopi" ;
        harga = 25000;
                break;
            case 2: 
                nama_pesanan="teh";
                harga=15000;
                break;
            case 3:
                nama_pesanan="air mineral";
                harga=10000;
                break;
            default:
                System.out.print("Maaf silahkan input ulang");
                break;
              
    }
        if (pesanan>=1 && pesanan<=3) {
           //if digunakan untuk melihat jumlah pesanan
            total=harga*jumlah_pesanan;
            System.out.print("Silahkan membayar Rp."+total);
        System.out.println("Terimakasih anda telah memesan "+ nama_pesanan +" sebanyak "+ jumlah_pesanan +"gelas, silahkan tunggu pesanan anda");
        
    
}
}
    
}
