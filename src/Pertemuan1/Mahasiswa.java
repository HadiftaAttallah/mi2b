/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author user
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main (String[] args) {
        Mahasiswa mhs= new Mahasiswa();
        mhs.nama ="Hadifta";
        mhs.nobp ="2101092049";
        mhs.kelas ="B";
        mhs.prodi ="MI";
        mhs.jurusan ="Teknologi Informasi";
        
        System.out.println("Nama :" +mhs.nama+ "\n"
                + "NO BP :"+mhs.nobp+"\n"
                        + "Jurusan :"+mhs.jurusan+"\n"
                                  +"Prodi :"+mhs.prodi+"\n"
                                        +"Kelas :"+mhs.kelas);
        
        System.out.println("");
        
        Mahasiswa mhs2= new Mahasiswa();
        mhs2.nama ="Aul";
        mhs2.nobp ="2101092045";
        mhs2.kelas ="B";
        mhs2.prodi ="MI";
        mhs2.jurusan ="Teknologi Informasi";
        
         System.out.println("Nama :" +mhs2.nama+ "\n"
                + "NO BP :"+mhs2.nobp+"\n"
                        + "Jurusan :"+mhs2.jurusan+"\n"
                                  +"Prodi :"+mhs2.prodi+"\n"
                                        +"Kelas :"+mhs2.kelas);
    }
}
