/**
 * Created by Syifa Solihat on 12/04/2017.
 */
import java.util.HashMap;

public class Admin {
      int id;
      String username;
      String password;
      String nik;

      HashMap<Integer, Admin> hmAdmin = new HashMap<>() ;

      public Admin (int id, String username, String password, String nik ) {

          this.id = id;
          this.username = username;
          this.password = password;
          this.nik = nik;

      }

      public void addAdmin(Admin pengguna){ hmAdmin.put (pengguna.id,pengguna);}

      public void print() {

          System.out.println("==== Admin ====");

          for (Admin pengguna : hmAdmin.values()) {
              System.out.println("Id:" + id);
              System.out.println("Username:" + username);
              System.out.println("Password:" + password);
              System.out.println("nik:" + nik);

          }
      }

      public void deletAdmin (int delet) {  hmAdmin.remove(delet); }

      public static void main(String[] args){
          Admin pengguna = new Admin(  1,  "Twiska",  "tw",  "112" );
          pengguna.addAdmin(pengguna);
          pengguna.print();
          pengguna.deletAdmin(  1);
          pengguna.print();

      }



}
