package Alex07133_Entity;
public class Alex07133_DaftarPelangganEntity {
   private Alex07133_PelangganEntity pelanggan; 
    private boolean isVerified;
    private int indexCamera; 
     public Alex07133_DaftarPelangganEntity(int indexCamera,
             Alex07133_PelangganEntity pelanggan, boolean isVerified) { 
         this.indexCamera = indexCamera;
        this.pelanggan = pelanggan;
        this.isVerified = isVerified;
    }
    public Alex07133_PelangganEntity getPelanggan() {
        return pelanggan;
    }
    public boolean isIsVerified() {
        return isVerified;
    }
    public int getIndexCamera() {
        return indexCamera;
    }
    public void setPelanggan(Alex07133_PelangganEntity pelanggan) {
        this.pelanggan = pelanggan;
    }
    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }
    public void setIndexCamera(int indexCamera) {
        this.indexCamera = indexCamera;
    }
}
