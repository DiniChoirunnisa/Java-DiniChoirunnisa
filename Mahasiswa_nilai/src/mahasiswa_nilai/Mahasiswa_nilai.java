/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa_nilai;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class mahasiswanilai{
    String jmlhnilai,Nomor_mahasiswa, Nama_mahasiswa, Kelas, Semester, Nilai_pemograman, Nilai_database, Nilai_design, Nilai_algoritma;
    int jumlah_nilai, nilai, ratarata, nilaimhs;
Scanner input= new Scanner(System.in);


//contructor
public mahasiswanilai(){
    Nomor_mahasiswa="";
    Nama_mahasiswa="";
    Kelas="";
    Semester="";
    Nilai_pemograman="";
    Nilai_database="";
    Nilai_design="";
    Nilai_algoritma="";
}        

//Procedure input
public void input (){
    
        System.out.print("Nomor Induk Mahasiswa : ");
        Nomor_mahasiswa=input.nextLine();   
        
        System.out.print("Nama Mahasiswa : ");
        Nama_mahasiswa=input.nextLine();
        
        System.out.print("Kelas: ");
        Kelas=input.nextLine();        
      
        System.out.print("Semester : ");
        Semester=input.nextLine();
        
        System.out.print("Nilai Pemrograman [A/B/C/D/E] : ");
        Nilai_pemograman=input.nextLine();
        
        System.out.print("Nilai Database [A/B/C/D/E] : ");
        Nilai_database=input.nextLine();
        
        System.out.print("Nilai Design [A/B/C/D/E] : ");
        Nilai_design=input.nextLine();
        
        System.out.print("Nilai Algoritma [A/B/C/D/E] : ");
        Nilai_algoritma=input.nextLine();

}

//Function Ifelse
public void ifelse (){

        if ("A".equals(Nilai_pemograman))
                {
                    nilaimhs=4;
                    }
        else if ("B".equals(Nilai_pemograman))
                {   nilaimhs=3;
                    }
        else if ("C".equals(Nilai_pemograman))
                {   nilaimhs=2;
                    }
        else if ("D".equals(Nilai_pemograman))
                {   nilaimhs=1;
                    }
        else 
                {   nilaimhs=0;
                    }
        
        if ("A".equals(Nilai_database))
                {
                    nilaimhs=4;
                    }
        else if ("B".equals(Nilai_database))
                {   nilaimhs=3;
                    }
        else if ("C".equals(Nilai_database))
                {   nilaimhs=2;
                    }
        else if ("D".equals(Nilai_database))
                {   nilaimhs=1;
                    }
        else 
                {   nilaimhs=0;
                    }
        
        if ("A".equals(Nilai_design))
                {
                    nilaimhs=4;
                    }
        else if ("B".equals(Nilai_design))
                {   nilaimhs=3;
                    }
        else if ("C".equals(Nilai_design))
                {   nilaimhs=2;
                    }
        else if ("D".equals(Nilai_design))
                {   nilaimhs=1;
                    }
        else 
                {   nilaimhs=0;
                    }
        
        
        if ("A".equals(Nilai_algoritma))
                {
                    nilaimhs=4;
                    }
        else if ("B".equals(Nilai_algoritma))
                {   nilaimhs=3;
                    }
        else if ("C".equals(Nilai_algoritma))
                {   nilaimhs=2;
                    }
        else if ("D".equals(Nilai_algoritma))
                {   nilaimhs=1;
                    }
        else 
                {   nilaimhs=0;
                    }
        
        
    }

public int Jumlahnilai(){
    //mengubah variabel str menjadi int
        int Nilai_pemograman=nilaimhs;
        int Nilai_database=nilaimhs;
        int Nilai_design=nilaimhs;
        int Nilai_algoritma=nilaimhs;
        jumlah_nilai=(Nilai_pemograman*4)+(Nilai_database*3)+(Nilai_design*1)+(Nilai_algoritma*2);
    return (jumlah_nilai);
}

public int rata_rata(){
    ratarata = jumlah_nilai/10;
    return (ratarata);
}

public void output(){
        System.out.println("==============================");
        ifelse();
        Jumlahnilai();   
        System.out.println("Nomor Induk Mahasiswa : "+ Nomor_mahasiswa);
        System.out.println("Nama Mahasiswa : "+Nama_mahasiswa);
        System.out.println("Kelas: "+Kelas);
        System.out.println("Semester : "+Semester);
        System.out.println("Jumlah nilai "+ Jumlahnilai());
        System.out.println("Rata-rata nilai "+ rata_rata());

    }
}

public class Mahasiswa_nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    mahasiswanilai mhs=new mahasiswanilai();    
    mhs.input();
    mhs.output();
    }
    
}
