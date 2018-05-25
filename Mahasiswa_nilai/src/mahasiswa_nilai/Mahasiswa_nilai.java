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
    int nilai, nilaiprg, nilaidsg, nilaidsb, nilaialg;
    double ratarata, jumlah_nilai;
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
    ratarata=0.0;
    jumlah_nilai=0.0;
    nilai=0;
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
                    nilaiprg=4;
                    }
        else if ("B".equals(Nilai_pemograman))
                {   
                    nilaiprg=3;
                    }
        else if ("C".equals(Nilai_pemograman))
                {   
                    nilaiprg=2;
                    }
        else if ("D".equals(Nilai_pemograman))
                {   
                    nilaiprg=1;
                    }
        else 
                {   nilaiprg=0;
                    }
        
        if ("A".equals(Nilai_database))
                {
                    nilaidsb=4;
                    }
        else if ("B".equals(Nilai_database))
                {   
                    nilaidsb=3;
                    }
        else if ("C".equals(Nilai_database))
                {   
                    nilaidsb=2;
                    }
        else if ("D".equals(Nilai_database))
                {   
                    nilaidsb=1;
                    }
        else 
                {   nilaidsb=0;
                    }
        
        if ("A".equals(Nilai_design))
                {
                    nilaidsg=4;
                    }
        else if ("B".equals(Nilai_design))
                {   
                    nilaidsg=3;
                    }
        else if ("C".equals(Nilai_design))
                {   
                    nilaidsg=2;
                    }
        else if ("D".equals(Nilai_design))
                {   
                    nilaidsg=1;
                    }
        else 
                {   nilaidsg=0;
                    }
        
        
        if ("A".equals(Nilai_algoritma))
                {
                    
                    nilaialg=4;
                    }
        else if ("B".equals(Nilai_algoritma))
                {   
                    nilaialg=3;
                    }
        else if ("C".equals(Nilai_algoritma))
                {   
                    nilaialg=2;
                    }
        else if ("D".equals(Nilai_algoritma))
                {   
                    nilaialg=1;
                    }
        else 
                {   nilaialg=0;
                    }
        
        
    }

public double Jumlahnilai(){
    //mengubah variabel str menjadi int
        int Nilai_pemograman=nilaiprg;
        int Nilai_database=nilaidsb;
        int Nilai_design=nilaidsg;
        int Nilai_algoritma=nilaialg;
        jumlah_nilai=(Nilai_pemograman*4)+(Nilai_database*3)+(Nilai_design*1)+(Nilai_algoritma*2);
    return (jumlah_nilai);
}

public double rata_rata(){
    ratarata = jumlah_nilai/10;
    return (ratarata);
}

public void output(){
        System.out.println("==============================");
        ifelse();
        System.out.println("Nomor Induk Mahasiswa : "+ Nomor_mahasiswa);
        System.out.println("Nama Mahasiswa : "+Nama_mahasiswa);
        System.out.println("Kelas: "+Kelas);
        System.out.println("Semester : "+Semester);
        Jumlahnilai();   
        System.out.println("Jumlah nilai "+ jumlah_nilai);
        rata_rata();
        System.out.println("Rata-rata nilai "+ ratarata);

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
