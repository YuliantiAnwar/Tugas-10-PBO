impor  java.util.Objects ; 
  kelas  publik Mahasiswa { 
     private  String nim; 
      nama String pribadi ; 
      alamat String pribadi ; 
      Mahasiswa publik () { 
     } 
     publik  Mahasiswa ( String  nim , String  nama , String  alamat ) { 
         ini . nim = nim; 
         ini . nama = nama; 
         ini . alamat = alamat; 
     } 
     public  String  getAlamat () { 
         mengembalikan alamat; 
     } 
     public  void  setAlamat ( String  alamat ) { 
         ini . alamat = alamat; 
     } 
     public  String  getNama () { 
         mengembalikan nama; 
     } 
     public  void  setNama ( String  nama ) { 
         ini . nama = nama; 
     } 
     public  String  getNim () { 
         kembali nim; 
     } 
     public  void  setNim ( String  nim ) { 
         ini . nim = nim; 
     } 
     @Mengesampingkan 
     public  String  toString () { 
         return "Mahasiswa{" + "nim=" + nim+ ", nama=" + nama+ ", alamat=" + alamat+ '}'; 
     } 
  
     @Override 
     public int hashCode() { 
         int hash = 3; 
         hash = 89 * hash + Objects.hashCode(this.nim); 
         hash = 89 * hash + Objects.hashCode(this.nama); 
         hash = 89 * hash + Objects.hashCode(this.alamat); 
         return hash; 
     } 
     @Override 
     public boolean equals(Object obj) { 
         if (this == obj) { 
             return true; 
         } 
         if (obj== null) { 
             return false; 
         }    
         if (getClass() != obj.getClass()) { 
             return false; 
         } 
         final Mahasiswa other = (Mahasiswa) obj; 
         if (!Objects.equals(this.nim, other.nim)) { 
             return false; 
         } 
         if (!Objects.equals(this.nama, other.nama)) { 
             return false; 
         } 
         if (!Objects.equals(this.alamat, other.alamat)) { 
             return false; 
         } 
         return true; 
     }    
 } 
