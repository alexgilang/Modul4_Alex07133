package Alex07133_Entity;
import java.util.Date;
public class Alex07133_PetugasEntity extends Alex07133_Rentalcamera{ 
    public Alex07133_PetugasEntity(String id,String nama,
    String alamat, String noIdentitas,String notelp){
        super(id,nama,alamat,noIdentitas,notelp); 
}
    
 @Override 
    public String getId() {
        return id;
    }
}

