/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject12;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int n,j,i;
    
    Scanner input= new Scanner (System.in);
    
    System.out.print ("Masukkan ukuran huruf H: ");
    if (!input.hasNextInt())
        {
            System.out.print ("Harus angka! Tidak bisa di proses");
        } 
        else
        {
        n=input.nextInt();
        i=1;
        while (i<=n) 
          {
            j=1;
            while (j<=n) {
                if (i==n/2+1 || j==1 || j==n )
                { //kenapa n/2+1 karna jika dimasukan angka 5 maka int akan membulatkan dari 5/2 menjadi 2
                    //lalu untuk menjadi huruf H harusnya ada di tengah pemotongannya maka harus n/2+1
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
                j++;
        }
             i++;
        System.out.println();
        }
    }
    
    }
    }
