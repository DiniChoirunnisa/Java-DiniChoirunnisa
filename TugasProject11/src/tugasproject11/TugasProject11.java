/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject11;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //BUATLAH SEBUAH APLIKASI MENAMBAHKAN DATA MAHASISWA SEBANYAK 10 KALI , 
    //JIKA DATA SUDAH 10 KALI MAKA AKAN MENCARI NILAI RATA-RATA 
   
    {
        
    int nilai, total=0, rata_rata = 0, i=1;
    String akreditasi = null;
    
    Scanner input= new Scanner (System.in);
    
    System.out.println ("Program Nilai Mahasiswa");
    System.out.println ("-----------------------");
    
    while (i<=10)
    {
        System.out.print ("nilai mahasiswa ke-"+i+" : ");
        nilai=input.nextInt();
        total+=nilai;
        i++;
    }
    System.out.println ();
    
    rata_rata=total/10;
    if (rata_rata>85)
    {
        akreditasi="Grade A";
    }
    else if (rata_rata>70)
    {
        akreditasi="Grade B";
    }
    else if (rata_rata>50)
    {
        akreditasi="BAN-PT";
    }
    else if (rata_rata<=50)
    {
        akreditasi="Tidak Terakreditasi";
    }
    
    

    System.out.println ("Jumlah nilai total : "+total);
    System.out.println ("rata-rata : "+ rata_rata);
    System.out.println ("Akreditasi : "+ akreditasi);
}   
}
}