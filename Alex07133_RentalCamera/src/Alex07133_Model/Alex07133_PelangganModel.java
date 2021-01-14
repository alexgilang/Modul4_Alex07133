package Alex07133_Model;
import Alex07133_Entity.Alex07133_CameraEntity;
import Alex07133_Entity.Alex07133_PelangganEntity;
import Alex07133_Model.Alex07133_DaftarPelangganModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Alex07133_PelangganModel implements Alex07133_ModeIinterfaces { 
    private ArrayList<Alex07133_PelangganEntity> pelangganEntityArrayList;
     
     public Alex07133_PelangganModel(){
        pelangganEntityArrayList = new ArrayList<Alex07133_PelangganEntity>();
    }
public void insert(Alex07133_PelangganEntity pelangganEntity){ //menambah data pelanggan
    pelangganEntityArrayList.add(pelangganEntity);  
}
public void hapusPelangganModel(int index) { //hapus data pelanggan 
        pelangganEntityArrayList.remove(pelangganEntityArrayList.get(index));
    }
 public int size() {
        return pelangganEntityArrayList.size();
    }
 @Override
    public int cekData(String id, String nama){
        int loop = 0;
        while (!pelangganEntityArrayList.get(loop).getId().equals(id) && 
                !pelangganEntityArrayList.get(loop).getnama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public Alex07133_PelangganEntity getpelangganEntityArrayList(int index){ //
        return pelangganEntityArrayList.get(index);
    }
}
