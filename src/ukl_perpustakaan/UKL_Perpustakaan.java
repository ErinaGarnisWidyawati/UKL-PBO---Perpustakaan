package ukl_perpustakaan;

public class UKL_Perpustakaan {

    public static void main(String[] args) {
        //membuat objek
        Buku note = new Buku();
        Siswa murid = new Siswa();
        Peminjaman pinjam= new Peminjaman();
        Laporan report = new Laporan();
        Menu menu = new Menu();
        Petugas staf = new Petugas();
        Pengembalian kembali = new Pengembalian();
        
        //menginputkan data 
        note.Buku();
        murid.Siswa();
        staf.Petugas();
        
        
        //menampilkan hasil inputan yang berbentuk list
        System.out.println("");
        report.Laporan(murid);
        System.out.println("");
        report.Laporan(note);
        System.out.println("");
        report.Laporan(staf);
        
        //menjalankan program menu
        System.out.println("");
        menu.Peminjaman(murid, note, pinjam, kembali);             
        
    }    
}
