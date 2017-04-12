import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 4/11/2017.
 */
public class transaksi_jual {
    String kd_trans_jual;
    String tgl_transaksi;
    String username;
    String kd_pelanggan;

    HashMap<String,transaksi_jual> hmtransJual = new HashMap<>();


    public transaksi_jual(String kd_trans_jual, String tgl_transaksi, String username, String kd_pelanggan) {
        this.kd_trans_jual = kd_trans_jual;
        this.tgl_transaksi = tgl_transaksi;
        this.username = username;
        this.kd_pelanggan = kd_pelanggan;
    }


    public void addTransjual(transaksi_jual tj) {
        hmtransJual.put(tj.kd_trans_jual,tj);
    }


    public void print() {
        System.out.println("== Minimarket ===");
        for (transaksi_jual tj :hmtransJual.values()) {
            System.out.println("Kode Transaksi  :"+kd_trans_jual);
            System.out.println("Tanggal Transaksi :"+tgl_transaksi);
            System.out.println("Username :"+username);
            System.out.println("Kode Pelanggan :"+kd_pelanggan);
        }
    }

    public void hapusTransaksi(String kd_hapus){
        hmtransJual.remove(kd_hapus);
    }

    public static void main(String[] args) {
        transaksi_jual tj = new transaksi_jual("1","12 April 2017", "Nia", "P01");
        tj.addTransjual(tj);
        tj.print();
        tj.hapusTransaksi("1");
        tj.print();
    }
}
