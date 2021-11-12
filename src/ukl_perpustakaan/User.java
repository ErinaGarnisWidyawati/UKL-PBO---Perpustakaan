package ukl_perpustakaan;

public interface User {
    
    String getNama(int id);
    String getAlamat(int id);      //method abstrak
    String getTelepon(int id);
    
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
}
