package ukl_perpustakaan;

import java.util.ArrayList;

public class Buku{
    //membuat arraylist 
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<String> judulBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    // menambahkan data pada arraylist
    public void Buku() {
        this.idBuku.add(0);
        this.judulBuku.add("Santri Pilihan Bunda");
        this.stok.add(10);
        this.harga.add(99000);

        this.idBuku.add(1);
        this.judulBuku.add("The Secret Relationship");
        this.stok.add(20);
        this.harga.add(99500);
        
        this.idBuku.add(2);
        this.judulBuku.add("My Killer Ketos");
        this.stok.add(30);
        this.harga.add(105000);
        
        this.idBuku.add(3);
        this.judulBuku.add("Galaksi Kejora");
        this.stok.add(5);
        this.harga.add(105000);
        
        this.idBuku.add(4);
        this.judulBuku.add("Best Moment");
        this.stok.add(20);
        this.harga.add(105000);
    }


    public void setIdBuku(int idBuku) {
        this.idBuku.add(idBuku);
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku.add(judulBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }
    
    public void setHarga(int Harga){
        this.harga.add(Harga);
    }

    public int getIdBuku(int idBuku) {
        return this.idBuku.get(idBuku);
    }

    public String getJudulBuku(int idBuku) {
        return this.judulBuku.get(idBuku);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public int getJumlahBuku(){
    return this.idBuku.size();
    }
    
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
    
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);
    }
}    
