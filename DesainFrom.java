impor  java.sql.SQLException ; 
 import  java.util. * ; 
 import  java.util.logging. * ; 
 import  javax.swing. * ; 
 import  javax.swing.event. * ; 
 import  javax.swing.plaf.nimbus.NimbusLookAndFeel ; 
 import  javax.swing.table.DefaultTableModel ; 
  DesainForm kelas  publik meluas javax.swing . JFrame {   
     Daftar record =  ArrayList baru  (); // untukmenampunggetAll () 
     InterfaceMahasiswa mhsServis; // untukmembuatobjekdariclass mengimplementasikan mahasiswa 
     baris int ; // untukmembantudalammenampilkandata di textfieldnimnamaalamat. 
     String kFak, kThn; 
      DesainForm publik () { 
         initComponents (); 
         mhsServis =  ImplementMahasiswa baru  (); 
         // supayakalodata di tabel di klikmakadata akanmuncullangsungdi textfieldnimnamaalamat 
         jTable1 . getSelectionModel () . addListSelectionListener ( baru  ListSelectionListener () { 
             public  void  valueDerubah ( ListSelectionEvent  e ) { 
                 baris = jTable1 . getSelectedRow (); 
                 if (row ! =  - 1 ) { 
                     isiText (); 
                 } 
             } 
         }); 
     ini . statusAwal (); 
     daftarKode (); 
     } 
      
     membatalkan  daftarKode () { 
         Obyek [] fak  = { " 130 " , " 145 " }; 
         Objek [] thn = { " 2012 " , " 2013 " , " 2014 " , " 2015 " , " 2016 " , " 2017 " , " 2018 " }; 
         for ( int i =  0 ; i < fak . length; i ++ ) { 
             CbKodeFak . addItem (fak [i] . toString ()); 
         } 
         kFak =  CbKodeFak . getSelectedItem () . toString (); 
         for ( int i =  0 ; i < thn . length; i ++ ) { 
             Cb . addItem (thn [i] . toString ()); 
         } 
         kThn =  CbThn . getSelectedItem () . toString (); 
     } 
  
     membatalkan  loadData () { 
         coba { 
             record = mhsServis . dapat semua(); 
             }  
         catch ( SQLException ex) { 
             Logger . getLogger ( SistemAkademik . kelas . getName ()) . log ( Level . BEVERE , null , ex); 
         } 
     } 
  
     batal  statusAwal () { 
         kosongkanText (); 
         loadData (); 
         isiTabel (); 
     } 
      
     private  void  BtnSimpanActionPerformed ( java.awt.event . ActionEvent  evt ) { 
         // TODO tambahkan kode penanganan Anda di sini: 
         coba { 
             // TODO tambahkan kode penanganan Anda di sini: 
             if ( " Simpan " . sama dengan ( this . BtnSimpan . getText ())) { 
                 Mahasiswa mhs =  Mahasiswa baru  (); 
                 mhs . setNim (kFak + kThn + txtNim . getText ()); 
                 mhs . setNama (txtNama . getText ()); 
                 mhs . setAlamat (txtAlamat . getText ()); 
                 mhsServis . masukkan (mhs); 
                 ini . statusAwal (); 
                 JOptionPane . showMessageDialog ( ini , " data disimpan " ); 
             } lain { 
                 txtNim . setEditable ( true ); 
                 CbKodeFak . setVisible ( true ); 
                 Cb . setVisible ( true ); 
                 BtnSimpan . setText ( " Simpan " ); 
                 kosongkanText (); 
             } 
         } catch ( SQLException ex) { 
             Logger . getLogger ( SistemAkademik . kelas . getName ()) . log ( Level . BEVERE , null , ex); 
         } 
     } 
  
     membatalkan  kosongkanText () { 
         txtNim . setText ( " " ); 
         txtNama . setText ( " " ); 
         txtAlamat . setText ( " " ); 
     } 
  
     private  void  BtnEditActionPerformed ( java.awt.event . ActionEvent  evt ) { 
         // TODO tambahkan kode penanganan Anda di sini: 
         coba { 
             // TODO tambahkan kode penanganan Anda di sini: 
             Mahasiswa mhs =  Mahasiswa baru  (); 
             mhs . setNim (txtNim . getText ()); 
             mhs . setNama (txtNama . getText ()); 
             mhs . setAlamat (txtAlamat . getText ()); 
             mhsServis . pembaruan (mhs); 
             ini . statusAwal (); 
             JOptionPane . showMessageDialog ( ini , " data berhasildiubah " ); 
         } catch ( SQLException ex) { 
             Logger . getLogger ( SistemAkademik . kelas . getName ()) . log ( Level . BEVERE , null , ex); 
         }    
     } 
  
     private  void  BtnHapusActionPerformed ( java.awt.event . ActionEvent  evt ) { 
         // TODO tambahkan kode penanganan Anda di sini: 
         coba { 
             // TODO tambahkan kode penanganan Anda di sini: 
             String nim = txtNim . getText (); 
             mhsServis . hapus (nim); 
             ini . statusAwal (); 
             JOptionPane . showMessageDialog ( ini , " data berhasildihapus " ); 
         } catch ( SQLException ex) { 
             Logger . getLogger ( SistemAkademik . kelas . getName ()) . log ( Level . BEVERE , null , ex); 
         } 
     } 
  
     batal  isiTabel () { 
         Obyek Data [] [] =  baru  objek [record . size ()] [ 3 ]; 
         int x =  0 ; 
         for ( Iterator it = record . iterator (); it . hasNext ();) { 
             Mahasiswa mhs = ( Mahasiswa ) itu . lanjut(); 
             data [x] [ 0 ] = mhs . getNim (); 
             data [x] [ 1 ] = mhs . getNama (); 
             data [x] [ 2 ] = mhs . getAlamat (); 
             x ++ ; 
         } 
         String judul [] = { " NIM " , " NAMA " , " ALAMAT " }; 
         jTable1 . setModel ( DefaultTableModel baru  (data, judul)); 
         jScrollPane1 . setViewportView (jTable1); 
     } 
     @SuppressWarnings ( " tidak dicentang " ) 
     // <editor-fold defaultstate = "collapsed" desc = "Generated Code"> // GEN-BEGIN: initComponents 
     private  void  initComponents () { 
  
         jScrollPane1 =  javax.swing baru  . JScrollPane (); 
         jTable1 =  javax.swing baru  . JTable (); 
         jLabel1 =  javax.swing baru  . JLabel (); 
         CbKodeFak  =  new  javax.swing.JComboBox <> (); 
         CbThn  =  new  javax.swing.JComboBox <> (); 
         txtNim =  javax.swing baru  . JTextField (); 
         jLabel2 =  javax.swing baru  . JLabel (); 
         txtNama =  javax.swing baru  . JTextField (); 
         jLabel3 =  javax.swing baru  . JLabel (); 
         txtAlamat =  javax.swing baru  . JTextField (); 
         BtnSimpan  =  javax.swing baru  . JButton (); 
         BtnEdit  =  javax.swing baru  . JButton (); 
         BtnHapus  =  javax.swing baru  . JButton (); 
         jScrollPane2 =  javax.swing baru  . JScrollPane (); 
         jTable2 =  javax.swing baru  . JTable (); 
         ketnim =  javax.swing baru  . JLabel (); 
  
         jTable1 . setModel ( javax.swing.table baru  . DefaultTableModel ( 
              Objek baru [] [] { 
                 { null , null , null , null }, 
                 { null , null , null , null }, 
                 { null , null , null , null }, 
                 { null , null , null , null } 
             }, 
              String baru [] { 
                 " Judul 1 " , " Judul 2 " , " Judul 3 " , " Judul 4 " 
             } 
         )); 
         jScrollPane1 . setViewportView (jTable1); 
  
         setDefaultCloseOperation ( javax.swing . WindowConstants . EXIT_ON_CLOSE ); 
  
         jLabel1 . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         jLabel1 . setText ( " NIM " ); 
  
         CbKodeFak . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         CbKodeFak . setModel ( new  javax.swing.DefaultComboBoxModel <> ( String baru  [] { " 130 " , " 131 " })); 
         CbKodeFak . addActionListener ( java.awt.event baru  . ActionListener () { 
             public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) { 
                 CbKodeFakActionPerformed (evt); 
             } 
         }); 
  
         Cb . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         Cb . setModel ( new  javax.swing.DefaultComboBoxModel <> ( String baru  [] { " 2012 " , " 2013 " , " 2014 " , " 2015 " , " 2016 " , " 2017 " , " 2017 " , " 2018 " })); 
         Cb . addActionListener ( java.awt.event baru  . ActionListener () { 
             public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) { 
                 CbThnActionPerformed (evt); 
             } 
         }); 
  
         txtNim . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
  
         jLabel2 . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         jLabel2 . setText ( " Nama " ); 
  
         txtNama . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         txtNama . addActionListener ( java.awt.event baru  . ActionListener () { 
             public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) { 
                 txtNamaActionPerformed (evt); 
             } 
         }); 
  
         jLabel3 . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         jLabel3 . setText ( " Alamat " ); 
  
         txtAlamat . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
  
         BtnSimpan . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         BtnSimpan . setText ( " Simpan " ); 
  
         BtnEdit . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         BtnEdit . setText ( " Edit " ); 
  
         BtnHapus . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         BtnHapus . setText ( " Hapus " ); 
  
         jTable2 . setFont ( new  java.awt . Font ( " Tempus Sans ITC " , 1 , 18 )); // NOI18N 
         jTable2 . setModel ( javax.swing.table baru  . DefaultTableModel ( 
              Objek baru [] [] { 
                 { null , null , null }, 
                 { null , null , null }, 
                 { null , null , null }, 
                 { null , null , null } 
             }, 
              String baru [] { 
                 " NIM " , " NAMA " , " ALAMAT " 
             } 
         )); 
         jScrollPane2 . setViewportView (jTable2); 
  
         javax.swing . Tata letak GroupLayout =  javax.swing baru  . GroupLayout (getContentPane ()); 
         getContentPane () . setLayout (tata letak); 
         tata letak . setHorizontalGroup ( 
             tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING ) 
             .addGroup (tata letak . createSequentialGroup () 
                 .addGap ( 30 , 30 , 30 ) 
                 .addGroup (tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING ) 
                     .addComponent (jScrollPane2, javax.swing . GroupLayout . PREFERRED_SIZE , 382 , javax.swing . GroupLayout . PREFERRED_SIZE ) 
                     .addGroup (tata letak . createSequentialGroup () 
                         .addGroup (tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING ) 
                             .addComponent (jLabel3) 
                             .addComponent (jLabel2) 
                             .addComponent (jLabel1)) 
                         .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED ) 
                         .addGroup (tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING , false ) 
                             .addGroup (tata letak . createSequentialGroup () 
                                 .addComponent ( BtnSimpan ) 
                                 .addGap ( 18 , 18 , 18 ) 
                                 .addComponent ( BtnEdit ) 
                                 .addGap ( 18 , 18 , 18 ) 
                                 .addComponent ( BtnHapus )) 
                             .addComponent (txtAlamat) 
                             .addComponent (txtNama) 
                             .addGroup ( javax.swing . GroupLayout . Alignment . TRAILING , tata letak . createSequentialGroup () 
                                 .addComponent ( CbKodeFak , javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ) 
                                 .addGap ( 18 , 18 , 18 ) 
                                 .addComponent ( CbThn , javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ) 
                                 .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED ) 
                                 .addComponent (txtNim, javax.swing . GroupLayout . PREFERRED_SIZE , 117 , javax.swing . GroupLayout . PREFERRED_SIZE ))) 
                         .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED ) 
                         .addComponent (ketnim))) 
                 .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Pendek . MAX_VALUE )) 
         ); 
         tata letak . setVerticalGroup ( 
             tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING ) 
             .addGroup (tata letak . createSequentialGroup () 
                 .addGap ( 33 , 33 , 33 ) 
                 .addGroup (tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE ) 
                     .addComponent (jLabel1) 
                     .addComponent ( CbKodeFak , javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ) 
                     .addComponent ( CbThn , javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ) 
                     .addComponent (txtNim, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ) 
                     .addComponent (ketnim)) 
                 .addGap ( 18 , 18 , 18 ) 
                 .addGroup (tata letak . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE ) 
                     .addComponent (jLabel2) 
                     .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                 .addGap(18, 18, 18) 
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                     .addComponent(jLabel3) 
                     .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                 .addGap(18, 18, 18) 
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                     .addComponent(BtnSimpan) 
                     .addComponent(BtnEdit) 
                     .addComponent(BtnHapus)) 
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE) 
                 .addGap(196, 196, 196)) 
         ); 
  
         pack(); 
     }// </editor-fold>//GEN-END:initComponents 
  
     private void CbKodeFakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbKodeFakActionPerformed 
        kFak= CbKodeFak.getSelectedItem().toString(); 
     }//GEN-LAST:event_CbKodeFakActionPerformed 
  
     private void CbThnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbThnActionPerformed 
         kThn= CbThn.getSelectedItem().toString(); 
     }//GEN-LAST:event_CbThnActionPerformed 
  
     private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed 
         // TODO add your handling code here: 
     }//GEN-LAST:event_txtNamaActionPerformed 
      
     private void txtNimKeyTyped(java.awt.event.KeyEvent evt) { 
         // TODO add your handling code here: 
         txtNim.setToolTipText("4 Angka"); 
         if(txtNim.getText().length()>3){ 
             ketnim.setText("4 Angka"); 
             txtNim.setEditable(false); 
         } 
     } 
  
     private void txtNimMouseClicked(java.awt.event.MouseEvent evt) { 
         // TODO add your handling code here: 
         txtNim.setEditable(true); 
         ketnim.setText(null); 
     } 
  
     void isiText() { 
         Mahasiswa mhs= (Mahasiswa) record.get(row); 
         txtNim.setText(mhs.getNim()); 
         txtNim.setEditable(false); 
         txtNama.setText(mhs.getNama()); 
         txtAlamat.setText(mhs.getAlamat()); 
         CbKodeFak.setVisible(false); 
         CbThn.setVisible(false); 
         BtnSimpan.setText("Aktif"); 
     } 
     /** 
      * @param args the command line arguments 
      */ 
     public static void main(String args[]) { 
         /* Create and display the form */ 
         try { 
             // TODO code application logic here 
             UIManager.setLookAndFeel(new NimbusLookAndFeel()); 
             SwingUtilities.invokeLater(new Runnable() { 
                 public void run() { 
                    DesainForm form = new DesainForm(); 
                     form.setLocationRelativeTo(null); 
                     form.setVisible(true); 
                 } 
             }); 
         } catch (UnsupportedLookAndFeelException ex) { 
             Logger.getLogger(SistemAkademik.class.getName()).log(Level.SEVERE, null, ex); 
         }    
     } 
     // Variables declaration - do not modify//GEN-BEGIN:variables 
     private javax.swing.JButton BtnEdit; 
     private javax.swing.JButton BtnHapus; 
     private javax.swing.JButton BtnSimpan; 
     private javax.swing.JComboBox<String> CbKodeFak; 
     private javax.swing.JComboBox<String> CbThn; 
     private javax.swing.JLabel jLabel1; 
     private javax.swing.JLabel jLabel2; 
     private javax.swing.JLabel jLabel3; 
     private javax.swing.JScrollPane jScrollPane1; 
     private javax.swing.JScrollPane jScrollPane2; 
     private javax.swing.JTable jTable1; 
     private javax.swing.JTable jTable2; 
     private javax.swing.JLabel ketnim; 
     private javax.swing.JTextField txtAlamat; 
     private javax.swing.JTextField txtNama; 
     private javax.swing.JTextField txtNim; 
     // Deklarasi variabel akhir // GEN-END: variabel 
 } 
