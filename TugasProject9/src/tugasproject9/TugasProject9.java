/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject9;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //TUGAS LOOPING
        String jeniskelamin, nama,kota;
  Scanner input=new Scanner (System.in);
  
  for (int i=1;i<4;i++)
      //i++ digunakan untuk penambahan i+1 sampai i<4
      //kalau tipe data char digunakan 'kode' pada case yang akan diketik
  {
      
      System.out.println ("Data peserta ke-"+i);
           
   System.out.print("Masukkan Nama : ");
        nama=input.nextLine();
        
        System.out.print("Masukkan kode kota (B/D/E): ");
        kota=input.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        jeniskelamin=input.nextLine();
        
    System.out.print (nama);
    
     
    switch(kota){
            case "B":
            System.out.print (" berasal dari Jakarta") ;
                break;
            case "D": 
            System.out.print (" berasal dari Bandung");
                break;
            case "E": 
            System.out.print (" berasal dari Cirebon");
                break;
            default:
            System.out.print(" kode kota tidak tersedia");
                break;  
                
    }
    switch(jeniskelamin){
            case "P":
            System.out.print (" dan berjenis Perempuan") ;
                break;
            case "L": 
            System.out.print (" dan berjenis Laki-laki");
                break;
            default:
            System.out.print( " dan jenis kelamin tidak terdeteksi");
                break;            
     
        
    
} System.out.println ("");
  }
    }
    
}
