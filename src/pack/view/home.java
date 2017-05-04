/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;

/**
 *
 * @author anggy
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko> listdata = new ArrayList<>();

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        getCbKategori().setSelectedItem(null);
        getCbJenis().setSelectedItem(null);
    }

    public JTextField getTxtKode(){ 
        return txtkode;
    }

    public JTextField getTxtNama() {
        return txtnama;
    }

    public JTextField getTxtHarga() {
        return txtharga;
    }

    public JComboBox getCbKategori() {
        return cbKategoriBrg;
    }

    public JComboBox getCbJenis() {
        return cbjenis;
    }

    public JComboBox getCbCariKategori() {
        return CbCariKategori;
    }

    public JButton getButtonHapus() {
        return Btn_Hapus;
    }

    public JButton getButtonBersih() {
        return Btn_Bersih;
    }

    public JButton getButtonSimpan() {
        return Btn_Simpan;
    }

    public JButton getButtonUbah() {
        return Btn_Ubah;
    }

    public JButton getButtonKeluar() {
        return Btn_Keluar;
    }

    public JTable getTableData() {
        return Tabel1;
    }
    public void setAdmin (String admin) {
        txtadmin.setText(admin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        Btn_Keluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        txtkode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Tokoku");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 50, 310, 60);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel2.setText("Admin Tokoku :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 180, 29);

        txtadmin.setEditable(false);
        txtadmin.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.add(txtadmin);
        txtadmin.setBounds(190, 20, 150, 30);

        Btn_Keluar.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Keluar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Btn_Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Keluar);
        Btn_Keluar.setBounds(870, 10, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 110);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(null);
        jPanel2.add(txtnama);
        txtnama.setBounds(140, 80, 370, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Harga Barang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 260, 100, 20);
        jPanel2.add(txtharga);
        txtharga.setBounds(140, 250, 370, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baju", "Celana", "Baranglain" }));
        jPanel2.add(cbKategoriBrg);
        cbKategoriBrg.setBounds(140, 130, 370, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack" }));
        jPanel2.add(cbjenis);
        cbjenis.setBounds(140, 190, 370, 30);
        jPanel2.add(txtkode);
        txtkode.setBounds(140, 20, 370, 30);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Kode Barang");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 24, 100, 20);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Nama Barang");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 80, 100, 20);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Kategori Barang");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 140, 150, 20);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Jenis Packing");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 200, 100, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-1, 92, 990, 300);

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(null);

        Btn_Hapus.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Hapus.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Btn_Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Hapus);
        Btn_Hapus.setBounds(440, 20, 110, 30);

        Btn_Simpan.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Simpan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        Btn_Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Simpan.setText("SIMPAN");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Simpan);
        Btn_Simpan.setBounds(30, 20, 110, 30);

        Btn_Ubah.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Ubah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Ubah.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ubah.setText("PERBARUI");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Ubah);
        Btn_Ubah.setBounds(170, 20, 110, 30);

        Btn_Bersih.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Bersih.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Bersih.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Bersih.setText("BERSIHKAN");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Bersih);
        Btn_Bersih.setBounds(310, 20, 110, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(20, 60, 970, 10);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 900, 300);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Cari Kategori");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(560, 20, 90, 30);

        CbCariKategori.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baju", "Celana", "Baranglain" }));
        jPanel3.add(CbCariKategori);
        CbCariKategori.setBounds(660, 20, 200, 30);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 14)); // NOI18N
        jButton2.setText("C A R I");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(870, 20, 100, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 390, 990, 420);

        setSize(new java.awt.Dimension(1005, 851));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        int baris = Tabel1.getSelectedRow();
        if(baris != -1){
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String) Tabel1.getValueAt(baris, 1));
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_Tabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ctoko.CariKategori();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String user = login.user;
        txtadmin.setText(" "+user);
    }//GEN-LAST:event_formWindowOpened

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
