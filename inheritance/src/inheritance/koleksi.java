/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

public class koleksi {
    String judul;
    String penerbit;
    int tahun;
    
    public koleksi (){
        System.out.println("Nadia Library");
    }
    public void ucapan(){
        System.out.println("Selamat Datang!");
    }
    
    public static void main(String[] args) {
    koleksi a = new koleksi();
    a.ucapan();
        System.out.println("\n");
    buku b = new buku();
    b.ucapan();
        System.out.println("\n");
    majalah c = new majalah();
    c.ucapan();
        System.out.println("\n");
    skripsi d = new skripsi();
    d.ucapan();
    d.lulus();
        System.out.println("\n");
    }
}

class buku extends koleksi {
    String penulis;
    public buku (){
        super ();
        judul="Bunga Cantik di Balik Salju";
        penerbit="Diva Press";
        tahun= 2012;
        penulis = "Titik Andarwati";
        System.out.println("Judul buku ini adalah "+judul);
        System.out.println("Buku ini di terbitkan oleh "+penerbit);
        System.out.println("Buku ini di terbitkan pada tahun "+tahun);
        System.out.println("Penulis buku ini adalah "+penulis);
    }
    
    public void ucapan (){
        System.out.println("Selamat Membaca!");
    }
}

class majalah extends koleksi {
    String edisi;
    public majalah (){
        super ();
        judul = "Kawan dalam Selimut";
        penerbit = "Tempo";
        tahun = 2022;
        edisi = "Berita";
        System.out.println("Judul majalah ini adalah "+judul);
        System.out.println("Majalah ini di terbitkan oleh "+penerbit);
        System.out.println("Majalah ini di terbitkan pada tahun "+tahun);
        System.out.println("Edisi majalah ini adalah "+edisi);
    }
    public void ucapan (){
        System.out.println("Selamat Membaca!");
    }
}

class skripsi extends buku {
    String NPM;
    public skripsi (){
        super ();
        NPM = "21081010181";
        penulis = "Nadia Dita Salsabila";
        judul = "UMKM Berbasis Web";
        penerbit = "Universitas Pembangunan Nasional Veteran Jawa Timur";
        tahun = 2023;
        System.out.println("NPM = "+NPM);
        System.out.println("Penulis skripsi ini adalah "+penulis);
        System.out.println("Judul skripsi saya adalah "+judul);
        System.out.println("Skripsi ini di terbitkan oleh "+penerbit);
        System.out.println("Skripsi ini di lakukan pada tahun "+tahun);
    }
    public void lulus (){
        System.out.println("Bismillah Lancar !!!!");
    }
}