/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject9mia;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject9Mia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String jenis_kelamin, nama,kode_kota, jeniskelamin, nama_kota;
  Scanner input=new Scanner (System.in);
  
  for (int i=1;i<=3;i++)
      
  {
      
      System.out.println ("Data peserta ke-"+i);
           
   System.out.print("Masukkan Nama : ");
        nama=input.nextLine();
        
        System.out.print("Masukkan kode kota (B/D/E): ");
        kode_kota=input.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        jenis_kelamin=input.nextLine();
        
    
     
    switch(kode_kota){
            case "B":
            nama_kota="Jakarta" ;
                break;
            case "D": 
            nama_kota="Bandung";
                break;
            case "E": 
            nama_kota="Cirebon";
                break;
            default:
            nama_kota="kode kota tidak tersedia";
                break;  
                
    }
   
    if ("P".equals(jenis_kelamin))
    {
        jeniskelamin="Perempuan" ;
    }
    else if ("L".equals(jenis_kelamin)) 
    {
        jeniskelamin="Laki-laki" ;
    }
    else 
    {
        jeniskelamin="jenis kelamin tidak terdeteksi";
    }       
     
  System.out.println(nama+"berasal dari kota "+nama_kota+" dan berjenis kelamin "+jeniskelamin);  
  System.out.println ("");
    }
    }
}
