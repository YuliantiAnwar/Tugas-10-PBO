impor  java.sql.SQLException ; 
 import  java.util.List ; 
  antarmuka  publik InterfaceMahasiswa { 
     Mahasiswa  memasukkan ( Mahasiswa  o ) melempar  SQLException ; 
     void  update ( Mahasiswa  o ) melempar  SQLException ; 
     void  delete ( String  nim ) melempar  SQLException ; 
     Daftar  getAll () melempar  SQLException ; 
 } 
