/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_perpustakaan;

/**
 *
 * @author MOKLET-2
 */
public class Laporan {
    //constructor untuk menampilkan list siswa
    public void Laporan(Siswa Siswa){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t \t Alamat \t Telepon ");
        for (int i = 0; i < Siswa.getJumlahSiswa(); i++) {
            System.out.println(Siswa.getId(i) + " \t " +
                    Siswa.getNama(i) + " \t\t" +
                    Siswa.getAlamat(i) + " \t" + 
                    Siswa.getTelepon(i));
        }
    }
    
    //constructor untuk menampilkan list buku
    public void Laporan(Buku Buku){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t\t\t Stok \t\t\t Harga");
        for (int i = 0; i < Buku.getJumlahBuku(); i++) {
            System.out.println(Buku.getIdBuku(i) + " \t " +
                    Buku.getJudulBuku(i) + " \t\t\t " +
                    Buku.getStok(i)+ " \t\t\t" + Buku.getHarga(i));
        }
        
    }
    
    //constructor untuk menampilkan list petugas
    public void Laporan (Petugas Petugas){
        System.out.println("---Petugas Hari Ini---");
        System.out.println("ID \t Nama \t\t\t Alamat \t\t\t Telepon ");
        for(int i = 0; i < Petugas.getJumlahPetugas(); i++){
            System.out.println(Petugas.getId(i) + "\t" 
                    + Petugas.getNama(i) + "\t\t" + 
                    Petugas.getAlamat(i) + "\t\t\t" +
                    Petugas.getTelepon(i));
        }
    }
}
