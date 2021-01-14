package Alex07133_Entity;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Alex07133_Rentalcamera {
protected String id,nama,alamat,noIdentitas,notelp;
    
public Alex07133_Rentalcamera(String id,String nama,
    String alamat, String noIdentitas,String notelp){
    this.id=id;
    this.nama=nama;
    this.alamat=alamat;
    this.noIdentitas=noIdentitas;
    this.notelp=notelp;
}
    public Alex07133_Rentalcamera(){
    } 
    
    public String getId() {
        return id;
    }
 
    public void setid(String id) {
        this.id = id;
    }

    public String getnama() {
        return nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getalamat() {
        return alamat;
    }
    public void setalamat(String alamat) {
        this.alamat = alamat;
    }
    public String getnoIdentitas() {
        return noIdentitas;
    }
    public void setnoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }
    public String getnotelp() {
        return notelp;
    }
    public void setnotelp(String notelp) {
        this.notelp = notelp;
    }  
}
