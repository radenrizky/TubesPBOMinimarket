import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 4/11/2017.
 */
public class Detail_transaksi_jual {
    int no_transaksi;
    String kd_barang;
    int jumlah_barang;

    HashMap<Integer,Detail_transaksi_jual> hmtransJual2 = new HashMap<>();


    public Detail_transaksi_jual(int no_transaksi, String kd_barang, int jumlah_barang) {
        this.no_transaksi = no_transaksi;
        this.kd_barang = kd_barang;
        this.jumlah_barang = jumlah_barang;
    }


    public void addTransjual(Detail_transaksi_jual tj) {
        hmtransJual2.put(tj.no_transaksi,tj);
    }


    public void print() {
        System.out.println("No. Transaksi  :"+no_transaksi);

        System.out.println("== Minimarket ===");
        for (Detail_transaksi_jual tj:hmtransJual2.values()) {
            System.out.println("Kode Barang  :"+kd_barang);
            System.out.println("Jumlah Barang  :"+jumlah_barang);
        }
    }

    public void hapusDetailtransaksi(int kd_hapus){
        hmtransJual2.remove(kd_hapus);
    }

    public static void main(String[] args) {
        Detail_transaksi_jual tj = new Detail_transaksi_jual(1, "PD001", 100);
        tj.addTransjual(tj);
        tj.print();
        tj.hapusDetailtransaksi(1);
        tj.print();
    }
}
