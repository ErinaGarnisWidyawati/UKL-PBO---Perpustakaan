package ukl_perpustakaan;

import java.util.Scanner;
import java.util.ArrayList;

    public class Peminjaman {

        private ArrayList<Integer> idBuku = new ArrayList<Integer>();
        private ArrayList<Integer> banyak = new ArrayList<Integer>();
        private ArrayList<Integer> idSiswa = new ArrayList<Integer>();

        public Peminjaman() {
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

        public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku buku) {
            Scanner myObj = new Scanner(System.in);
            
            //info untuk keluar
            System.out.println("Ketikan '99' untuk keluar dari menu");
            
            System.out.println("<<< Silahkan Meminjam Buku >>>");
            System.out.println("Masukkan ID Member");
            int idSiswa = myObj.nextInt();
            System.out.println("---- Halo, Selamat datang " + siswa.getNama(idSiswa)+ " , Semoga Buku yang Kamu Inginkan Tersedia Ya!! ----");
            ArrayList<Integer> idBuku = new ArrayList<Integer>();
            ArrayList<Integer> banyak = new ArrayList<Integer>();
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
            if (!siswa.isStatus(idSiswa)) {
                System.out.println("Mohon Maaf, Anda Tidak Bisa Meminjam Karena Masih Ada Tanggungan Peminjaman");
            } else {
                System.out.print("");
                System.out.println("<< Nota Peminjaman Dari " + siswa.getNama(idSiswa) + " sebagai berikut : >>");
                System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");
                int total = 0;
                int x = idBuku.size();
                for (int j = 0; j < x; j++) {
                    int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
                    total += jumlah;
                    System.out.println(buku.getJudulBuku(idBuku.get(j)) + "\t" + banyak.get(j) + "\t" + buku.getHarga(idBuku.get(j)) + "\t" + jumlah);
                    peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
                }
                System.out.println("Total Harga Peminjaman : " + total);
                
                
                //method untuk mengubah nilai dari status siswa dengan menggunakan operator unary !
                siswa.editStatus(idSiswa, !siswa.isStatus(idSiswa));                
            }
        }

        public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyaknya) {
            this.idSiswa.add(idSiswa);
            this.idBuku.add(idBuku);
            this.banyak.add(banyaknya);
            buku.editStok(idBuku, buku.getStok(idBuku) - banyaknya);
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