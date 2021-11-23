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
        
        insertMember();
        
        // atribut
        String idMember;
        int dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn;
        Scanner input = new Scanner(System.in);
    
        // input
        System.out.println("+ ========================= Program Pengembalian Console Game Rental ========================= +");
        
        System.out.print("\n| Masukkan ID Member               | : ");
        idMember = input.nextLine();
        
        System.out.print("\n| Masukkan Tanggal Pinjam (1 - 31) | : ");
        dateRent = input.nextInt();
        
        System.out.print("| Masukkan Bulan Pinjam (1 - 12)   | : ");
        monthRent = input.nextInt();
        
        System.out.print("| Masukkan Tahun Pinjam (xxxx)     | : ");
        yearRent = input.nextInt();
        
        System.out.println("----------------------------------------------------");
        
        System.out.print("\n| Masukkan Tanggal Kembali (1 - 31)| : ");
        dateReturn = input.nextInt();
        
        System.out.print("| Masukkan Bulan Kembali (1 - 12)  | : ");
        monthReturn = input.nextInt();
        
        System.out.print("| Masukkan Tahun Kembali (xxxx)    | : ");
        yearReturn = input.nextInt();
        
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        searchMember(idMember);
        
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        System.out.println("\n| Tanggal Pinjam                   | : " + dateRent + " - " + monthRent + " - " + yearRent);
        System.out.println("| Tanggal Kembali                  | : " + dateReturn + " - " + monthReturn + " - " + yearReturn);

        int rentalDuration = rentDuration(dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn);
        System.out.println("| Lama Sewa                        | : " + rentalDuration + " hari");
        
        String jenisMember = getJenisMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("\n| Total Sewa                       | : Rp. " + memSil.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + memSil.getPoint(rentalDuration));
        
        } else if(jenisMember == "Gold") {
            System.out.println("\n| Total Sewa                       | : Rp. " + memGold.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + memGold.getPoint(rentalDuration));
            System.out.println("| Jumlah Cashback              | : Rp. " + memGold.cashback);
            
        } else if(jenisMember == "Platinum") {
            System.out.println("\n| Total Sewa                       | : Rp. " + memPlat.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + memPlat.getPoint(rentalDuration));
            System.out.println("| Jumlah Cashback              | : Rp. " + memPlat.cashback);
            System.out.println("| Bonus Pulsa                  | : Rp. " + memPlat.getBonus(rentalDuration));
            
        } else {
            System.out.println("");
        }
    }
}