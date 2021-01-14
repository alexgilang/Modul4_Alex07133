package Alex07133_Controller;
import Alex07133_Entity.Alex07133_PetugasEntity;
import Alex07133_Entity.Alex07133_DaftarPelangganEntity;
import Alex07133_Entity.Alex07133_PelangganEntity;
import java.util.Date;
import java.util.ArrayList;
public class Alex07133_PetugasController implements Alex07133_ControllerInterface{
    int indexLogin = 0;
    public Alex07133_PetugasController() {    
    }
    
    public void datapetugas(){
        String id[] = {"01","02","03"};
        String nama [] = {"astrid","sabrina","alex"};
        String alamat [] = {"mojokerto","mojokerto","sidoarjo"};
        String noIdentitas [] = {"01","02","03"};
        String notelp [] = {"01","02","03"};
              for(int i=0;i<id.length;i++){
                Alex07133_AllObjectModel.petugasModel.insertPetugas(new 
                Alex07133_PetugasEntity(id[i],nama[i],alamat[i],
                noIdentitas[i],notelp[i]));
            }
    }
    
    @Override
    public void login(String id, String nama) {
        indexLogin =  Alex07133_AllObjectModel.petugasModel.cekData(id, nama);
    }
    
    public Alex07133_PetugasEntity Alex07133_PetugasEntity() {
        return Alex07133_AllObjectModel.petugasModel.showDataPetugas(indexLogin);
    }
    
    public void updateIsVerified(int index,int indexCamera,Alex07133_PelangganEntity pelanggan ) {
        Alex07133_AllObjectModel.daftarPelangganmodel.updateIsVerified(index, new 
        Alex07133_DaftarPelangganEntity(indexCamera, pelanggan,true));
    }
    
    public ArrayList<Alex07133_DaftarPelangganEntity> cekDaftarPelangganModel() {
        return Alex07133_AllObjectModel.daftarPelangganmodel.getdaftarpelangganArrayList();
    }
}
