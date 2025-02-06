package Arrays;

public class NilaiSiswa {
  public static void main(String[] args) {
    // inisilisasi array values
    int[] nilai = { 85, 90, 75, 92, 88, 83 };

    // untuk print array atau data collection gitu
    // printnya pakai for
    for (int i = 0; i < nilai.length; i++) {
      System.out.println("Nilai siswa " + (i+1) + " = " + nilai[i]);
    }

    int total = 0;
    for (int i = 0; i < nilai.length; i++) {
      total += nilai[i];
    }

    double rataRata = (double) total / nilai.length;

    // print hasilnya
    System.out.println("\nNilai rata-rata siswa " + rataRata);
  }
}
