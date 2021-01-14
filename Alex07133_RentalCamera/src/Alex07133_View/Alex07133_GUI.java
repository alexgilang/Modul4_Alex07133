package Alex07133_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class Alex07133_GUI {
    JFrame TampilanAwal = new JFrame();//tampilan awal
    JLabel login,daftar,top; 
    JRadioButton radioPetugas,radiopelanggan; //tombol pilihan
    JTextField textidlogin,textnamalogin,textalamat,textnoidentitas,textnotelp,texttglsewa,
                texttglkembali,textiddaftar,textnamadaftar;
    JLabel labelidlogin,labelnamalogin,labelalamat,labelnoidentitas,labelnotelp,labeltglsewa,
            labeltglkembali,labeliddaftar,labelnamadaftar;
    JButton check,reg; //tombol
    
    private boolean ceklogin = false;
    public Alex07133_GUI(){ //komponen
        TampilanAwal.setSize(700, 630); //ukuran 
        TampilanAwal.setLayout(null);
        TampilanAwal.getContentPane().setBackground(Color.ORANGE); //warna background
        
        top = new JLabel("====RENTAL CAMERA====");
        top.setBounds(50, 10, 600, 50); 
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        TampilanAwal.add(top);
        
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        TampilanAwal.add(login);
        
        radioPetugas = new JRadioButton("Petugas");
        radioPetugas.setBounds(30, 150, 100, 30);
        radioPetugas.setBackground(Color.GRAY);
        TampilanAwal.add(radioPetugas);
        
        radiopelanggan = new JRadioButton("pelanggan");
        radiopelanggan.setBounds(140, 150, 100, 30);
        radiopelanggan.setBackground(Color.GRAY);
        TampilanAwal.add(radiopelanggan);
        
        labelidlogin = new JLabel("Id");
        labelidlogin.setBounds(30, 180, 30, 30);
        TampilanAwal.add(labelidlogin);
        textidlogin = new JTextField();
        textidlogin.setBounds(30, 210, 200, 30);
        TampilanAwal.add(textidlogin);
        
        labelnamalogin = new JLabel("Nama");
        labelnamalogin.setBounds(30, 240, 100, 30);
        TampilanAwal.add(labelnamalogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(30, 270, 200, 30);
        TampilanAwal.add(textnamalogin);
        
        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.GRAY);
        TampilanAwal.add(check);
        
        daftar = new JLabel("Daftar");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(440, 50, 150, 100);
        TampilanAwal.add(daftar);
        
        labeliddaftar = new JLabel("Id");
        labeliddaftar.setBounds(400, 150, 30, 30);
        TampilanAwal.add(labeliddaftar);
        textiddaftar = new JTextField();
        textiddaftar.setBounds(400, 180, 200, 30);
        TampilanAwal.add(textiddaftar);
        
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(400, 210, 100, 30);
        TampilanAwal.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(400, 240, 200, 30);
        TampilanAwal.add(textnamadaftar);
        
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(400, 270, 100, 30);
        TampilanAwal.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(400, 300, 200, 30);
        TampilanAwal.add(textalamat);
        
        labelnoidentitas = new JLabel("No Identitas");
        labelnoidentitas.setBounds(400, 330, 100, 30);
        TampilanAwal.add(labelnoidentitas);
        textnoidentitas = new JTextField();
        textnoidentitas.setBounds(400, 360, 200, 30);
        TampilanAwal.add(textnoidentitas);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 390, 200, 30);
        TampilanAwal.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 420, 200, 30);
        TampilanAwal.add(textnotelp);
        
        labeltglsewa = new JLabel("Tanggal sewa (dd/mm/yyyy)");
        labeltglsewa.setBounds(400, 450, 200, 30);
        TampilanAwal.add(labeltglsewa);
        texttglsewa = new JTextField();
        texttglsewa.setBounds(400, 480, 200, 30);
        TampilanAwal.add(texttglsewa);
        
        labeltglkembali = new JLabel("Tanggal kembali (dd/mm/yyyy)");
        labeltglkembali.setBounds(400, 510, 200, 30);
        TampilanAwal.add(labeltglkembali);
        texttglkembali = new JTextField();
        texttglkembali.setBounds(400, 540, 200, 30);
        TampilanAwal.add(texttglkembali);
        
        reg = new JButton("Daftar");
        reg.setBounds(460, 580, 100, 40);
        reg.setBackground(Color.GRAY);
        TampilanAwal.add(reg);
        TampilanAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TampilanAwal.setVisible(true);
        TampilanAwal.setLocationRelativeTo(null);
        radioPetugas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ //method aslab
                if(radioPetugas.isSelected()){
                    radiopelanggan.setSelected(false);
                    ceklogin=true;
                }
            }
        });
        
        radiopelanggan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ //untuk praktikan
                if(radiopelanggan.isSelected()){
                    radioPetugas.setSelected(false);//untuk aslab false
                    ceklogin=false;
                }
            }
        });
        
        check.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ //method
                if(ceklogin==true){
                    try{ 
                        Alex07133_Allobjctrl.admin.datapetugas(); // login untuk petugas
                        Alex07133_Allobjctrl.admin.login(textidlogin.getText(), textnamalogin.getText());
                        String nama = Alex07133_Allobjctrl.admin.Alex07133_PetugasEntity().getnama(); //memasukkan id,nama, jika benar 
                        JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                        Alex07133_PetugasGUI petugas = new Alex07133_PetugasGUI();
                        TampilanAwal.dispose();
                    }catch(Exception exception){ //jika id/nama salah makan akan muncul pesan
                        JOptionPane.showMessageDialog(null, "id atau nama salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                        kosong();//method kosong, jika datanya kosong
                }else{
                    try{ //login untuk pelanggan
                       Alex07133_Allobjctrl.Pelanggan.login(textidlogin.getText(),textnamalogin.getText());
                       String nama = Alex07133_Allobjctrl.Pelanggan.getData().getnama(); //memasukkan id,nama, jika benar 
                       JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                       Alex07133_PelangganGUI  pel = new Alex07133_PelangganGUI();
                       TampilanAwal.dispose();
                    }catch(Exception eception){ //jika id/nama salah makan akan muncul pesan
                        JOptionPane.showMessageDialog(null, "id atau nama salah", "information", JOptionPane.INFORMATION_MESSAGE);
                       kosong(); //method kosong, jika datanya kosong
                    }
                }
            }
        });
        
        reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String id = textiddaftar.getText(); //regristasi
                    String nama = textnamadaftar.getText();
                    String alamat = textalamat.getText();
                    String noidentitas = textnoidentitas.getText();
                    String notelp = textnotelp.getText();
                    Date tglsewa = new Date(texttglsewa.getText());
                    Date tglkembali = new Date(texttglkembali.getText());
                    Alex07133_Allobjctrl.Pelanggan.insert(id, nama, alamat, noidentitas, notelp, tglsewa, tglkembali); //jika sukses
                    JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
       void kosong(){
        textiddaftar.setText(null);//settext null semua
        textnamadaftar.setText(null);
        textalamat.setText(null);
        textnoidentitas.setText(null);
        textnotelp.setText(null);
        texttglsewa.setText(null);
        texttglkembali.setText(null);
        textidlogin.setText(null);
        textnamalogin.setText(null);
    }
}
