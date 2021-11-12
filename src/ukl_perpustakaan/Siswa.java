package ukl_perpustakaan;

import java.util.ArrayList;

public class Siswa implements User{
     
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();        
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    // Set data Siswa
    public void Siswa(){
        this.idSiswa.add(0);
        this.namaSiswa.add("Erina");
        this.alamat.add("Blitar");
        this.telepon.add("09582393593");
        this.status.add(true);
        
        this.idSiswa.add(1);
        this.namaSiswa.add("Garnis");
        this.alamat.add("Blitar");
        this.telepon.add("08124221397");
        this.status.add(true);
        
        this.idSiswa.add(2);
        this.namaSiswa.add("Kezhia");
        this.alamat.add("Ngawi");
        this.telepon.add("08124221087");
        this.status.add(true);
        
        this.idSiswa.add(3);
        this.namaSiswa.add("Aulia");
        this.alamat.add("Malang");
        this.telepon.add("0812422625");
        this.status.add(true);
        
        this.idSiswa.add(4);
        this.namaSiswa.add("Nabella");
        this.alamat.add("Tulungagung");
        this.telepon.add("0812422468");
        this.status.add(true);
        
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    // method untuk menentukan status siswa
    public String getStatus(int idSiswa){
        if(this.status.get(idSiswa)){
            return ("Anda Diizinkan Meminjam Buku");
        }else{
            return ("Anda Tidak Diizinkan Meminjam Buku");
        }
    }

    //method untuk meng Get data dari status
    public boolean isStatus(int idSiswa){
        return status.get(idSiswa);
    }
    
    // mengakses isi dari array namaSiswa
    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    // mengakses isi dari array alamat
    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    // mengakses isi dari array telepon
    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }

    //
    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public int getJumlahSiswa(){
        return this.namaSiswa.size();
    }
    
    public int getId(int idSiswa){
        return this.idSiswa.get(idSiswa);
    }
    
    //method untuk mengedit isi dari array dengan index menurut idSiswa
    public void editStatus(int idSiswa, boolean status){
        this.status.set(idSiswa, status);            
    }
 }
