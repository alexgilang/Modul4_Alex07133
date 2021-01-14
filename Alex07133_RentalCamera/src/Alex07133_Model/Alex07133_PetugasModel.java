package Alex07133_Model;
import Alex07133_Entity.Alex07133_PetugasEntity;
import java.util.ArrayList;
public class Alex07133_PetugasModel implements Alex07133_ModeIinterfaces{ 
    private  ArrayList <Alex07133_PetugasEntity> PetugasEntityArrayList;   
    public Alex07133_PetugasModel(){
    PetugasEntityArrayList = new ArrayList<Alex07133_PetugasEntity>();
    }
    public void insertPetugas(Alex07133_PetugasEntity petugas){
        PetugasEntityArrayList.add(petugas);
    }
     @Override   
    public int cekData(String id, String nama){
        int loop = 0;
        for(Alex07133_PetugasEntity petugasEntity : PetugasEntityArrayList){
            if(petugasEntity.getId().equals(id) && petugasEntity.getnama().equals(nama)){
            break;
            }else{
                loop++;
            }
        }
        return loop;
   }
    public Alex07133_PetugasEntity showDataPetugas(int index){
        return PetugasEntityArrayList.get(index);
    }
}
