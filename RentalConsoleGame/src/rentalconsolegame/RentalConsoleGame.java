/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class RentalConsoleGame extends Lainnya{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MemberSilver memSil = new MemberSilver();
        MemberGold memGold = new MemberGold();
        MemberPlatinum memPlat = new MemberPlatinum();
        
        insertDataMember();
        
        // atribut
        String idMember;
        int tglRental, blnRental, thnRental, tglReturn, blnReturn, thnReturn;
        Scanner input = new Scanner(System.in);
    
        // input
        System.out.println("+ ========================= Program Pengembalian Console Game Rental ========================= +");
        
        System.out.print("\n| Masukkan ID Member               | : ");
        idMember = input.nextLine();
        
        System.out.print("\n| Masukkan Tanggal Pinjam (1 - 31) | : ");
        tglRental = input.nextInt();
        
        System.out.print("| Masukkan Bulan Pinjam (1 - 12)   | : ");
        blnRental = input.nextInt();
        
        System.out.print("| Masukkan Tahun Pinjam (xxxx)     | : ");
        thnRental = input.nextInt();
        
        System.out.println("----------------------------------------------------");
        
        System.out.print("\n| Masukkan Tanggal Kembali (1 - 31)| : ");
        tglReturn = input.nextInt();
        
        System.out.print("| Masukkan Bulan Kembali (1 - 12)  | : ");
        blnReturn = input.nextInt();
        
        System.out.print("| Masukkan Tahun Kembali (xxxx)    | : ");
        thnReturn = input.nextInt();
        
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        cariDataMember(idMember);
        
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        System.out.println("\n| Tanggal Pinjam                   | : " + tglRental + " - " + blnRental + " - " + thnRental);
        System.out.println("| Tanggal Kembali                  | : " + tglReturn + " - " + blnReturn + " - " + thnReturn);

        int lamaRental = lamaRental(tglRental, blnRental, thnRental, tglReturn, blnReturn, thnReturn);
        System.out.println("| Lama Sewa                        | : " + lamaRental + " hari");
        
        String jenisMember = ambilJenisMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("\n| Total Sewa                       | : Rp. " + memSil.biayaTotal(lamaRental));
            System.out.println("| Jumlah Poin                      | : " + memSil.perolehanPoint(lamaRental));
        
        } else if(jenisMember == "Gold") {
            System.out.println("\n| Total Sewa                       | : Rp. " + memGold.biayaTotal(lamaRental));
            System.out.println("| Jumlah Poin                      | : " + memGold.perolehanPoint(lamaRental));
            System.out.println("| Jumlah Cashback              | : Rp. " + memGold.cashback);
            
        } else if(jenisMember == "Platinum") {
            System.out.println("\n| Total Sewa                       | : Rp. " + memPlat.biayaTotal(lamaRental));
            System.out.println("| Jumlah Poin                      | : " + memPlat.perolehanPoint(lamaRental));
            System.out.println("| Jumlah Cashback              | : Rp. " + memPlat.cashback);
            System.out.println("| Bonus Pulsa                  | : Rp. " + memPlat.getBonus(lamaRental));
            
        } else {
            System.out.println("");
        }
    }
}