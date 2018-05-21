/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject16;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */

class gajian{
        String nama,golongan, nomorinduk;
        int potongan, tunjangan, gaji;
        
        
//contructor
public gajian(){
    nama="";
    golongan="";
    nomorinduk="";
    int potongan=0;
    int tunjangan=0;
    int gaji=0;
}

//Procedure input
public void input (){
    Scanner input = new Scanner (System.in);
    System.out.println("GAJI PEGAWAI");
    System.out.print("Masukkan Nomer Induk Pegawai : ");
    nomorinduk=input.nextLine();
        
    System.out.print("Masukkan Nama : ");
    nama=input.nextLine();
        
    System.out.print("Masukkan Golongan [1/2/3/4] : ");
    golongan=input.nextLine();

}
//Function if else/switch
public void switch_case(){
switch(golongan){
            case "1":
                gaji=2000000;
                tunjangan=gaji*40/100;
                potongan=40000;
                break;
            case "2": 
                gaji=2500000;
                tunjangan=gaji*40/100;
                potongan=40000;
                break;
            case "3": 
                gaji=3000000;
                tunjangan=gaji*50/100;
                potongan=50000;
                break;
            case "4": 
                gaji=4000000;
                tunjangan=gaji*60/100;
                potongan=55000;
                break;
            default:
                System.out.print ("Golongan yang diinputkan tidak tersedia");
                break;
        }
}

public int total(){
    return (gaji + tunjangan - potongan);
}

//Procedure output
public void output(){
    System.out.println("Terimakasih telah memasukkan data sebagai berikut : ");
            System.out.println("Nama : "+ nama);
            System.out.println("Nomor Induk : "+ nomorinduk);
            System.out.println("Golongan : "+golongan);
            System.out.println("Gaji Pokok : " +gaji);
            System.out.println("Tunjangan : " + tunjangan);
            System.out.println("Potongan : " + potongan);
            System.out.println("Total gaji: Rp."+ total());
  
}
}

//Program utama
public class TugasProject16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    gajian pgw=new gajian();
    pgw.input();
    pgw.switch_case();
    pgw.output();
    }
    
}
