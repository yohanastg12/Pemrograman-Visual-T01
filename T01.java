// 12S22008 - Rahel Uli Rotua Simanjuntak
// 12S22050 - Yohana Sitanggang
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        
        iSBN = input.nextLine();
        String judul;
        
        judul = input.nextLine();
        String penulis;
        
        penulis = input.nextLine();
        String tahunTerbit;
        
        tahunTerbit = input.nextLine();
        String penerbit;
        
        penerbit = input.nextLine();
        String formatBukuElektronik;
        
        formatBukuElektronik = input.nextLine();
        double hargaPembelian;
        
        hargaPembelian = input.nextDouble();
        double minimumMargin;
        
        minimumMargin = input.nextDouble();
        int stok;
        
        stok = input.nextInt();
        double rating;
        
        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating);
    }
}
