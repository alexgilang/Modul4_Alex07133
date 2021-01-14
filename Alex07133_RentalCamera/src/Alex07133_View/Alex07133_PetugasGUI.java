package Alex07133_View;
import Alex07133_Controller.Alex07133_AllObjectModel;
import Alex07133_Controller.Alex07133_PelangganController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class Alex07133_PetugasGUI {
    private static Alex07133_PelangganController pelanggan = new Alex07133_PelangganController();
    JFrame petugas = new JFrame();
    JTable tabelpelanggan = new JTable();
    JScrollPane scrollpetugas = new JScrollPane(tabelpelanggan);
    JButton back,verif,hapus;
    JLabel admin,idlabel,namalabel;
    JTextField idtext,namatext;
     public Alex07133_PetugasGUI(){
        petugas.setSize(650,500);
        petugas.setLayout(null);
        petugas.getContentPane().setBackground(Color.ORANGE);
        
        admin = new JLabel("Petugas");
        admin.setBounds(250, 30, 200, 30);
        admin.setFont(new Font("Timer New Roman",Font.BOLD,40));
        petugas.add(admin);
        
        scrollpetugas.setBounds(30, 100, 570, 200);
        tabelpelanggan.setModel(pelanggan.daftarpel());
        petugas.add(scrollpetugas);
        
        idlabel = new JLabel("Id");
        idlabel.setBounds(50, 320, 100, 30);
        petugas.add(idlabel);
        idtext = new JTextField();
        idtext.setBounds(50, 350, 100, 30);
        petugas.add(idtext);
        
        namalabel = new JLabel("Nama");
        namalabel.setBounds(200, 320, 100, 30);
        petugas.add(namalabel);
        namatext = new JTextField();
        namatext.setBounds(200, 350, 100, 30);
        petugas.add(namatext);
        
        verif = new JButton("verif");
        verif.setBounds(350, 350, 100, 30);
        verif.setBackground(Color.GRAY);
        petugas.add(verif);
        
        back = new JButton("back");
        back.setBounds(50, 400, 100, 30);
        back.setBackground(Color.GRAY);
        petugas.add(back);
        
        hapus = new JButton("Hapus");
        hapus.setBounds(350, 400, 100, 30);
        hapus.setBackground(Color.GRAY);
        petugas.add(hapus);
        
        petugas.setLocationRelativeTo(null);
        petugas.setVisible(true);
        petugas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                petugas.dispose();
                Alex07133_GUI men = new Alex07133_GUI();//nama objek men
            }
        });
        
        verif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ //untuk verifikasi id, dan nama
                String id = idtext.getText();
                String nama = namatext.getText();
                int index = Alex07133_AllObjectModel.daftarPelangganmodel.cekData(id, nama); //dicek
                Alex07133_Allobjctrl.admin.updateIsVerified(index, Alex07133_Allobjctrl.Pelanggan.showDaftarPelanggan(index)
                        .getIndexCamera(),Alex07133_Allobjctrl.Pelanggan.showDaftarPelanggan(index).getPelanggan());
                tabelpelanggan.setModel(pelanggan.daftarpel());
            }
        });
        
        hapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Alex07133_Allobjctrl.Pelanggan.deleteDataPelanggan(0);
                tabelpelanggan.setModel(pelanggan.daftarpel());
            }
        });
        
        tabelpelanggan.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){  //method
                int i = tabelpelanggan.getSelectedRow();
                idtext.setText(Alex07133_Allobjctrl.Pelanggan.daftarpel().getValueAt(i, 0).toString());
                namatext.setText(Alex07133_Allobjctrl.Pelanggan.daftarpel().getValueAt(i, 1).toString());
            }
        });
     }
}
