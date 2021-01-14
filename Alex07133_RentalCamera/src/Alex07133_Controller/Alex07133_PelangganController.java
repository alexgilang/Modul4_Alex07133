package Alex07133_Controller;
import Alex07133_Entity.Alex07133_DaftarPelangganEntity;
import Alex07133_Entity.Alex07133_PelangganEntity;
import Alex07133_Model.Alex07133_PelangganModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class Alex07133_PelangganController implements Alex07133_ControllerInterface{
    int indexLogin = 0;
    
    public Alex07133_PelangganController() {
    }
    
    public Alex07133_PelangganEntity getData() {
        return Alex07133_AllObjectModel.pelangganModel.getpelangganEntityArrayList(indexLogin);
    }
    
    public void Alex07133_DaftarCamera(int indexCamera,  Alex07133_PelangganEntity pelanggan,
            boolean isVerified) {
        Alex07133_AllObjectModel.daftarPelangganmodel.insertDataPelanggan(new 
        Alex07133_DaftarPelangganEntity (indexCamera,pelanggan, isVerified));
    }
    
    @Override
    public void login(String id, String nama) {
        indexLogin = Alex07133_AllObjectModel.pelangganModel.cekData(id, nama);
    }
    
    public void insert(String id,String nama,
    String alamat, String noIdentitas,String notelp,Date tgl_sewa,Date tgl_kembali) {
        Alex07133_PelangganEntity pelangganModel = new Alex07133_PelangganEntity();
        pelangganModel.setid(id);
        pelangganModel.setnama(nama);
        pelangganModel.setalamat(alamat);
        pelangganModel.setnoIdentitas(noIdentitas);
        pelangganModel.setnotelp(notelp);
        pelangganModel.setTgl_sewa(tgl_sewa);
        pelangganModel.setTgl_kembali(tgl_kembali);
        Alex07133_AllObjectModel.pelangganModel.insert(pelangganModel);
    }

    public int cekDaftarPelanggan(String id) {
        int cek = Alex07133_AllObjectModel.daftarPelangganmodel.cekData(id, null);
        return cek;
    }
    
    public Alex07133_DaftarPelangganEntity showDaftarPelanggan(int index) {
        return Alex07133_AllObjectModel.daftarPelangganmodel.showDaftarPelanggan(index);
    }
    public void deleteDataPelanggan(int index) {
        Alex07133_AllObjectModel.daftarPelangganmodel.hapusPelangganModel(index);
    }
    public ArrayList<Alex07133_DaftarPelangganEntity> cekDaftarPelangganModel() {
        return Alex07133_AllObjectModel.daftarPelangganmodel.getdaftarpelangganArrayList();
    }
    public DefaultTableModel daftarpel(){
        DefaultTableModel dtmdaftarpel = new DefaultTableModel();
        Object[] kolom ={"Id","Nama","Alamat","No Identitas","No Telp","Tgl Sewa","Tgl Kembali","camera","Verified"};
        dtmdaftarpel.setColumnIdentifiers(kolom);
        int size = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().size();
        String verif = null;
        for(int i=0;i<size;i++){
            if(Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).isIsVerified()==false){
                verif = "no";
            }else{
                verif = "yes";
            }
            Object [] data = new Object[9];
            data[0] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getId();
            data[1] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getnama();
            data[2] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getalamat();
            data[3] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getnoIdentitas();
            data[4] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getnotelp();
            data[5] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getTgl_sewa();
            data[6] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getPelanggan().getTgl_kembali();
            data[7] = Alex07133_AllObjectModel.daftarPelangganmodel.alldatapelanggan().get(i).getIndexCamera();
            data[8] = verif;
            dtmdaftarpel.addRow(data);
    }
        return dtmdaftarpel;
    }
}
