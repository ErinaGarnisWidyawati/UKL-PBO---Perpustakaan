package ukl_perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Pengembalian {
    
        private ArrayList<Integer> idBuku = new ArrayList<Integer>();
        private ArrayList<Integer> banyak = new ArrayList<Integer>();
        private ArrayList<Integer> idSiswa = new ArrayList<Integer>();

        public Pengembalian() {
            this.idSiswa.add(0);
            this.idBuku.add(0);
            this.banyak.add(2);
            this.idSiswa.add(0);
            this.idBuku.add(1);
            this.banyak.add(3);
            this.idSiswa.add(1);
            this.idBuku.add(0);
            this.banyak.add(1);
            this.idSiswa.add(1);
            this.idBuku.add(2);
            this.banyak.add(2);
        }

        /*Method untuk melakukan pengembalian dengan parameter berbagai class
        dengan inputan user*/
        public void prosesPengembalian(Siswa siswa, Pengembalian pengembalian, Buku buku) {
            //deklarasi scanner
            Scanner myObj = new Scanner(System.in);
            
            //info untuk keluar
            System.out.println("Ketikan '99' untuk keluar dari menu");
            
            //header pengembalian buku
            System.out.println("<<< Silahkan Mengembalikan Buku >>>");
            System.out.println("Masukkan ID Member");
            
            //input user idSiswa
            int idSiswa = myObj.nextInt();
            
            //tampilan selamat datang 
            System.out.println("Selamat datang " + siswa.getNama(idSiswa));
            ArrayList<Integer> idBuku = new ArrayList<Integer>();
            ArrayList<Integer> banyak = new ArrayList<Integer>();
            System.out.println("Syarat Pengembalian : WAJIB MENGEMBALIKAN BUKU SESUAI DENGAN JUMLAH YANG DIPINJAM");
            
            //pembuatan sistem 
            int i = 0;
            int temp = 0;
            do {
                System.out.println("Masukkan kode barang :");
                temp = myObj.nextInt();
                if (temp != 99) {
                    idBuku.add(temp);
                    System.out.print(buku.getJudulBuku(idBuku.get(i)) + " sebanyak : ");
                    banyak.add(myObj.nextInt());
                    i++;
                }
            } while (temp != 99);
            if (siswa.isStatus(idSiswa)) {
                System.out.println("Tidak bisa mengembalikan");
            } else {
                System.out.print("");
                System.out.println("Transaksi Pengembalian " + siswa.getNama(idSiswa) + "sebagai berikut");
                System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");
                int total = 0;
                int x = idBuku.size();
                for (int j = 0; j < x; j++) {
                    int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
                    total += jumlah;
                    System.out.println(buku.getJudulBuku(idBuku.get(j)) + "\t" + banyak.get(j) + "\t" + buku.getHarga(idBuku.get(j)) + "\t" + jumlah);
                    pengembalian.setPengembalian(buku, idSiswa, idBuku.get(j), banyak.get(j));
                }
                System.out.println("Total Harga Pengembalian : " + total);
                System.out.println("Terimakasih Telah Mengembalikan Buku");
                
                //pemanggilan method untuk mengubah nilai dari status dengan operator unary !
                siswa.editStatus(idSiswa, !siswa.isStatus(idSiswa));
                
            }
        }
        
        //method untuk menengubah stok buku setelah dijalankannya method prosesPengembalian
        public void setPengembalian(Buku buku, int idSiswa, int idBuku, int banyaknya) {
            this.idSiswa.add(idSiswa);
            this.idBuku.add(idBuku);
            this.banyak.add(banyaknya);
            buku.editStok(idBuku, buku.getStok(idBuku) + banyaknya);
        }
        
        public int getIdBuku(int id) {
            return this.idBuku.get(id);
        }

        public int getBanyaknya(int id) {
            return this.banyak.get(id);
        }

        public int getIdSiswa(int id) {
            return this.idSiswa.get(id);
        }
        
        public int getJmlPeminjaman() {
            return this.idSiswa.size();
        }
}
