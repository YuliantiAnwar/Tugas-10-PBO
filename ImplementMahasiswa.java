import  java.sql.PreparedStatement ; 
 import  java.sql.ResultSet ; 
 impor  java.sql.SQLException ; 
 import  java.sql.Statement ; 
 import  java.util.ArrayList ; 
 import  java.util.List ; 
 public  class  ImplementMahasiswa  mengimplementasikan  InterfaceMahasiswa { 
     public  Mahasiswa  insert ( Mahasiswa  o ) melempar  SQLException { 
         PreparedStatement st = DatabaseUtilities . getConnection () . prepStatement ( " masukkan ke nilai siswa ( ?,?,?) " ); 
         st . setString ( 1 , o . getNim ()); 
         st . setString ( 2 , o . getNama ()); 
         st . setString ( 3 , o . getAlamat ()); 
         st . executeUpdate (); 
     kembali o; 
     } 
  
     public  void  update ( Mahasiswa  o ) melempar  SQLException { // untukupdate kedatabase 
         PreparedStatement st = DatabaseUtilities . getConnection () . prepStatement ( " perbarui pelajarwaset nama = ?, alamat =? where nim =? " ); 
         st.setString(1, o.getNama()); 
         st.setString(2, o.getAlamat()); 
         st.setString(3, o.getNim()); 
         st.executeUpdate(); 
     } 
     public void delete(String nim) throws SQLException{// untukdelete berdasarkannim 
         PreparedStatement st=DatabaseUtilities.getConnection().prepareStatement("delete from mahasiswawhere nim=?"); 
         st.setString(1, nim); 
         st.executeUpdate(); 
     } 
  
     public List getAll() throws SQLException{ // untukread all, jadisemuadata diambildanditampilkan 
         Statement st=DatabaseUtilities.getConnection().createStatement(); 
         ResultSet rs=st.executeQuery("select * from mahasiswa"); 
         List list=new ArrayList(); 
         while(rs.next()){ 
             Mahasiswa mhs=new Mahasiswa(); 
             mhs.setNim(rs.getString("nim")); 
             mhs.setNama(rs.getString("nama")); 
             mhs . setAlamat (rs . getString ( " alamat " )); 
             daftar . tambah (mhs); 
         } 
         daftar kembali ; 
     } 
 } 
