package Alex07133_Model; 
import Alex07133_Entity.Alex07133_DaftarPelangganEntity;
import Alex07133_Entity.Alex07133_CameraEntity;
import Alex07133_Entity.Alex07133_PetugasEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.ArrayList; 
public class Alex07133_DaftarPelangganModel implements Alex07133_ModeIinterfaces { 
    private ArrayList<Alex07133_DaftarPelangganEntity> daftarpelangganArrayList;
    public Alex07133_DaftarPelangganModel(){
    daftarpelangganArrayList = new ArrayList<Alex07133_DaftarPelangganEntity>();
        }
    public void insertDataPelanggan(Alex07133_DaftarPelangganEntity daftarpelanggan){
        daftarpelangganArrayList.add(daftarpelanggan);
    }
    public ArrayList<Alex07133_DaftarPelangganEntity> getdaftarpelangganArrayList(){
        return daftarpelangganArrayList;
    }
    @Override 
    public int cekData(String id, String nama){
        int loop = 0;
        if(daftarpelangganArrayList.size() ==0){
            loop = -1;//data kosong
        }else{
            for(int i = 0; i <daftarpelangganArrayList.size(); i++){
            if(daftarpelangganArrayList.get(i).getPelanggan().getId().equals(id)){
                loop = i;
                break;
            }else{
                loop = -2;
                }
            }
        }   return loop;
    }
    public Alex07133_DaftarPelangganEntity showDaftarPelanggan(int index){
        return daftarpelangganArrayList.get(index); //menampilkan data pelanggan
    }
    public void hapusPelangganModel(int index) {
        daftarpelangganArrayList.remove(daftarpelangganArrayList.get(index)); //mengapus data pelanggan
    }
    public void updateIsVerified(int index,Alex07133_DaftarPelangganEntity daftarpelanggan){
    daftarpelangganArrayList.set(index, daftarpelanggan); 
    }
    public ArrayList <Alex07133_DaftarPelangganEntity> alldatapelanggan(){
        return  daftarpelangganArrayList;
    }
}
