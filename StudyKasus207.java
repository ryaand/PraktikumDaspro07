import java.util.Scanner;

public class StudyKasus207 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nama mahasiswa: ");
    String nama = sc.nextLine();
    System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA: ");
    String lomba = sc.nextLine();

    if (lomba.equalsIgnoreCase("belmawa") ||
        lomba.equalsIgnoreCase("bakorma") ||
        lomba.equalsIgnoreCase("mandiri")) {
      System.out.print("Peringkat juara: ");
      int peringkatJuara = sc.nextInt();
      System.out.print("Jumlah dokumen: ");
      int jumlahDokumen = sc.nextInt();

      if (peringkatJuara >= 1 && peringkatJuara <= 3) {
        if (jumlahDokumen == 4) {
          System.out.println("Status: Mendapat pendanaan");
        } else {
          int kurang = 4 - jumlahDokumen;
          System.out.println("Status: Dokumen tidak lengkap (dokumen kurang " + kurang + "). Dana penghargaan tidak diberikan");
        } 
      } else {
        System.out.println("Status: Anda bukan juara utama. Dana penghargaan tidak diberikan");
      }
    } 
  }
}
