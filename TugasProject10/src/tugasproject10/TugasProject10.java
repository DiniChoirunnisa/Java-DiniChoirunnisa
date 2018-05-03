/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject10;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nama,kota,jeniskelamin;
  Scanner inputan=new Scanner (System.in);
  
  for (int i=1;i<4;i++)
      
  {
      
      System.out.println ("Data peserta ke-"+i);
           
   System.out.print("Masukkan Nama : ");
        nama=inputan.nextLine();
        
        System.out.print("Masukkan kode kota : ");
        kota=inputan.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin : ");
        jeniskelamin=inputan.nextLine();
        
        System.out.println(nama+"berasal dari kota "+kota+" dan berjenis kelamin "+jeniskelamin);
        
    
}
    }
    
}
