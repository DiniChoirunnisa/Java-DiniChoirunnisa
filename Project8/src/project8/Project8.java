/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project8;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //MEMPELAJARI PENGGUNAAN ARRAY
    
    //contoh biasa
    int nilai = 0;
    
    Scanner input= new Scanner (System.in);
    
    System.out.println ("input nilai 3 buah ");
    
    for (int i=0;i<3;i++)
    {
        System.out.print ("Masukkan nilai ke-"+i+ " : ");
        nilai=input.nextInt();
    }
    System.out.println ("Jadi nilainya adalah "+nilai);
    

    //contoh ARRAY (contoh diatas dilanjutkan kebawah)
    System.out.println ("ARRAY");
    System.out.println ("Input nilai 3 buah");
    
    int nilai_ar[]=new int [3];
         for (int i=0;i<3;i++)
    {
        System.out.print ("Masukkan nilai ke-"+i+ " : ");
        nilai_ar[i]=input.nextInt();   
    }
         
    System.out.print ("Jadi nilainya adalah ke-1 : " +nilai_ar[0]+ " ke-2 : " +nilai_ar[1]+"  ke-3 : " +nilai_ar[2]);
    }
    
}
