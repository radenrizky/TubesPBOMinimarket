import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Twiska Ajeng on 4/12/2017.
 */
public class Detail_transaksi_beli {
    int no_transaksi;
    String kd_transaksi_beli;
    String kd_barang;
    int jumlah;

    HashMap<Integer,Detail_transaksi_beli> hmtransBeli = new HashMap<>();


    public Detail_transaksi_beli(int no_transaksi, String kd_transaksi_beli, String kd_barang, int jumlah_barang) {
        this.no_transaksi = no_transaksi;
        this.kd_transaksi_beli = kd_transaksi_beli;
        this.kd_barang = kd_barang;
        this.jumlah = jumlah;
    }


    public void addTransBeli(Detail_transaksi_beli tb) {
        hmtransBeli.put(tb.no_transaksi,tb);
    }


    public void print() {
        System.out.println("No. Transaksi  :"+no_transaksi);

        for (Detail_transaksi_beli tb:hmtransBeli.values()) {
            System.out.println("Kode Barang  :"+kd_barang);
            System.out.println("Jumlah Barang  :"+jumlah);
        }
    }

    public void hapusDetailtransaksi(int kd_hapus){
        hmtransBeli.remove(kd_hapus);
    }

    public static void main(String[] args) {
        Detail_transaksi_beli tb = new Detail_transaksi_beli(1, "112A", 10);
        tb.addTransBeli(tb);
        tb.print();
        tb.hapusDetailtransaksi(1);
        tb.print();
    }
}
}
