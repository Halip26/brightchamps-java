package Arrays;

public class InventoriBarang {
  public static void main(String[] args) {
    String[] barang = { "Buku", "Pensil", "Penghapus", "Pulpen", "Penggaris" };
    int[] stock = { 10, 15, 5, 20, 7 };

    // show the result
    for (int i = 0; i < barang.length; i++) {
      System.out.println("Barang: " + barang[i] + "\nStock: " + stock[i]);

    }
  }
}
