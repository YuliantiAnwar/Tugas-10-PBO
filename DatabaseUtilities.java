impor  java.sql.Connection ; 
 import  java.sql.DriverManager ; 
 impor  java.sql.SQLException ; 
 import  java.util.logging.Level ; 
 import  java.util.logging.Logger ; 
  DatabaseUtilities kelas  publik { 
      Sambungan statis  pribadi ; 
      Koneksi getConnection publik statis  () {  
         if (con == null ) { 
             coba { 
                 DriverManager . registerDriver ( baru  com.mysql.jdbc . driver ()); 
                 con = DriverManager . getConnection ( " jdbc: mysql: // localhost: 3306 / dbakademik " , " root " , " " ); 
                 // dbnyadbakademik, usernyaroot, danpasswordnyakosong 
             }  
             catch ( SQLException ex) { 
                 Logger . getLogger ( DatabaseUtilities . class . getName ()) . log ( Level . BEVERE , null , ex); 
             } 
         } 
     kembali con; 
     } 
 } 
