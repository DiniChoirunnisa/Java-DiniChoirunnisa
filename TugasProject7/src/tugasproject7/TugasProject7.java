/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject7;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //TUGAS SWICTH CASE
        int total,jumlah_kursi,harga = 0,nama_jurusan = 0;
        String nama,jurusan ;
        
System.out.println("Jurusan Bus Antar Kota");
        System.out.println("1. BSD-Bandung");
        System.out.println("2. Bandung-BSD");
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Nama Pemesan : ");
        nama=input.nextLine();
        
        System.out.print("Jumlah Kursi : ");
        jumlah_kursi=input.nextInt();
        
        System.out.print("Jurusan : ");
        nama_jurusan = input.nextInt();
       
       
        
        
        
        switch(nama_jurusan){
            case 1:
                jurusan="BSD-Bandung" ;
        harga = 70000;
                break;
            case 2: 
                jurusan="Bandung-BSD";
                harga=50000;
                break;
        }       
                if (nama_jurusan>=1 && nama_jurusan<=2) {
           
            total = harga*jumlah_kursi;
            System.out.println("tiket telah dipesan oleh "+nama);
            System.out.println("jurusan "+nama_jurusan+"dengan jumlah "+jumlah_kursi);
            System.out.println("tiket dengan total bayar yaitu Rp."+total);
                }
    }
    
}
