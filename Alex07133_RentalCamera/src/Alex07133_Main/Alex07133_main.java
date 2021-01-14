package Alex07133_Main;
import Alex07133_Entity.Alex07133_CameraEntity;
import Alex07133_Entity.Alex07133_DaftarPelangganEntity;
import Alex07133_Model.Alex07133_DaftarPelangganModel;
import Alex07133_Controller.Alex07133_PetugasController;
import Alex07133_Controller.Alex07133_AllObjectModel;
import Alex07133_Controller.Alex07133_PelangganController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; 
import Alex07133_View.Alex07133_GUI;

public class Alex07133_main {
    private static Alex07133_PetugasController petugasModel = new Alex07133_PetugasController(); 
    private static Alex07133_PelangganController pelangganModel = new Alex07133_PelangganController();
    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args){ 
        Alex07133_main data = new Alex07133_main();
        data.view(); 
    }
    void view(){
    do {
            int pilih;
            System.out.println("Menu\n" +
                    "1. Console\n" +
                    "2. GUI\n" +
                    "Masukkan Pilihan Anda : ");
            pilih = input.nextInt();

            switch (pilih){
                case 1:
                    viewMenu();
                    break;
                case 2:
                    GUI();
                    break;
                default:
                    break;
            }
        }while (true);
    }
    
    void GUI(){
        Alex07133_GUI gui = new Alex07133_GUI();
    }
    
    void viewMenu(){
        int loop = 0;
        int pilih = 0;
        int pilLogin = 0;
        petugasModel.datapetugas();
        do{
           System.out.print("Selamat Datang Di RENTAL CAMERA !!" +
                            "\n 1. Login" +
                            "\n 2. Daftar Pelanggan" +
                            "\n 3. Hapus Pelanggan"+
                            "\n 4. Lihat Pelanggan"+
                            "\n 5. Close"+
                            "\n Masukkan Pilihan Anda : ");
                        pilih = input.nextInt();
                        if(pilih == 1){
            System.out.print("1. Login petugas" + "\n2. Login pelanggan" + "\n Pilih : ");
                pilLogin = input.nextInt();
                if(pilLogin == 1){
                    loginPetugas();  
                }else{
                    loginPelanggan();
                }
            }else if(pilih == 2){
                register();
            }else if(pilih == 3){
                viewHapusDataPelanggan();
            }else if(pilih == 4){
                if (petugasModel.cekDaftarPelangganModel().size() == 0) {
                System.out.println("Data Masih Kosong !!!");
                } else{
                viewDataPelanggan();
                }
            }else if(pilih == 5){
                view();
            }else{
                break;
            }
        }while (loop != 1);
    }
     
        void register(){
                System.out.print("Input ID = ");
                String id = input.next();
                System.out.print("Input nama = ");
                String nama = input.next();
                System.out.print("Input Alamat = ");
                String alamat = input.next();
                System.out.print("Input no Identitas = ");
                String noIdentitas =  input.next();
                System.out.print("Input no Telepon = ");
                String notelp =  input.next();
                System.out.print("Input Tgl sewa (dd/mm/yyyy) = ");
                Date Tgl_sewa = new Date(input.next());
                System.out.print("Input Tgl kembali (dd/mm/yyyy) = ");
                Date Tgl_kembali = new Date(input.next());
                pelangganModel.insert(id,nama,alamat,noIdentitas,notelp,Tgl_sewa,Tgl_kembali);
                System.out.println("Daftar Sukses !!");
        }
        
        static void registerPelanggan() {
        System.out.println("Pilih Camera : ");
        for (int i = 0; i < Alex07133_CameraEntity.merk.length; i++) {
            System.out.println((i) + " " + Alex07133_CameraEntity.merk[i]);
        }
        int pilPrak = input.nextInt();
        pelangganModel.Alex07133_DaftarCamera(pilPrak, pelangganModel.getData(), false);
        
    }
        
        void viewDataPelanggan() {
        int i=0;
        for (Alex07133_DaftarPelangganEntity pelanggan : pelangganModel.cekDaftarPelangganModel()) {
                System.out.println("Data Ke - : "+i);
                System.out.println("Id : " + pelangganModel.showDaftarPelanggan(i).getPelanggan().getId());
                System.out.println("Nama = "+pelangganModel.showDaftarPelanggan(i).getPelanggan().getnama());
                System.out.println("No identitas = "+pelangganModel.showDaftarPelanggan(i).getPelanggan().getnoIdentitas());
                System.out.println("No telp = "+pelangganModel.showDaftarPelanggan(i).getPelanggan().getnotelp());
                System.out.println("camera = "+Alex07133_CameraEntity.merk[pelangganModel.showDaftarPelanggan(i).getIndexCamera()]);
                System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(pelangganModel.showDaftarPelanggan(i).getPelanggan().getTgl_sewa()));
                System.out.println("Tgl kembali           : "+new SimpleDateFormat(" dd - MM - yyyy").format(pelangganModel.showDaftarPelanggan(i).getPelanggan().getTgl_kembali()));
                System.out.println("isVerified = ");
                if (pelangganModel.showDaftarPelanggan(i).isIsVerified() == false) {
                    System.out.print("Belum Di Verifikasi petugas\n");
                    System.out.print("===========================\n");
                } else {
                    System.out.print("Telah Di Verifikasi petugas\n");
                    System.out.print("===========================\n");
                }         
            i++;
        }
    }
        
        void loginPelanggan(){
        System.out.print("ID : ");
        String id = input.next();
        System.out.print("Nama : ");
        String nama = input.next();
        try {
        pelangganModel.login(id, nama);
        System.out.println("Selamat datang "+pelangganModel.getData().getnama());
        int cekpelanggan = pelangganModel.cekDaftarPelanggan(pelangganModel.getData().getId());
        if (cekpelanggan == -1){
            System.out.println("Anda belum memilih kamera");
                registerPelanggan();
        }else if(cekpelanggan == -2){
            System.out.println("Anda belum memilih kamera");
                registerPelanggan();
        }else{
        System.out.println("Nama = "+pelangganModel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnama());
        System.out.println("id = "+pelangganModel.showDaftarPelanggan(cekpelanggan).getPelanggan().getId());
        System.out.println("No identitas = "+pelangganModel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnoIdentitas());
        System.out.println("No telp = "+pelangganModel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnotelp());
        System.out.println("camera = "+Alex07133_CameraEntity.merk[pelangganModel.showDaftarPelanggan(cekpelanggan).getIndexCamera()]);
        System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(pelangganModel.showDaftarPelanggan(cekpelanggan).getPelanggan().getTgl_sewa()));
        System.out.println("Tgl kembali           : "+new SimpleDateFormat(" dd - MM - yyyy").format(pelangganModel.showDaftarPelanggan(cekpelanggan).getPelanggan().getTgl_kembali()));
        System.out.println("isVerified = ");
         if (pelangganModel.showDaftarPelanggan(cekpelanggan).isIsVerified() == false) {
                System.out.print("Belum Di Verifikasi petugas\n");
            } else {
                System.out.print("Telah Di Verifikasi petugas\n");
            }
        
        }} catch (Exception e) {
            System.out.println("id atau nama Anda Salah !!!");
        }
    }
        
        void loginPetugas(){
        System.out.print("id : ");
        String id = input.next();
        System.out.print("nama: ");
        String nama = input.next();
        try {
            petugasModel.login(id, nama);
            System.out.println("Selamat Datang " + petugasModel.Alex07133_PetugasEntity().getnama() + " Id "
                    + petugasModel.Alex07133_PetugasEntity().getId());
            if (petugasModel.cekDaftarPelangganModel().size() == 0) {
                System.out.println("Data Masih Kosong !!!");
            } else{
                viewDataPelanggan();
                updateIsVerified();
            }
        } catch (Exception e) {
            System.out.println("id atau nama Anda Salah !!!");
        }
    }
         
        void updateIsVerified() {
        System.out.println("id Pelanggan : ");
        String id = input.next();
        System.out.println("=======================");
        int index = Alex07133_AllObjectModel.daftarPelangganmodel.cekData(id, null);
        petugasModel.updateIsVerified(index, pelangganModel.showDaftarPelanggan(index).getIndexCamera(),pelangganModel.showDaftarPelanggan(index).getPelanggan());
    }
        
        void viewHapusDataPelanggan() {
        viewDataPelanggan();
        System.out.print("Pilih Data Ke - : ");
        int index = input.nextInt();
        pelangganModel.deleteDataPelanggan(index);
        System.out.println("Data Berhasil Dihapus");
    }   
}