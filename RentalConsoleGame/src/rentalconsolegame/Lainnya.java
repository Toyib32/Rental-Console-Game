/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ASUS
 */
public class Lainnya {
    static Map<String, List<String>> member = new HashMap<String, List<String>>();
    static int waktuRental;
    
    // insert data member 
    static void insertDataMember() {
        
        // insert M001
        List<String> nilaiSatu = new ArrayList<String>();
        nilaiSatu.add("Mr. X");
        nilaiSatu.add("Silver");
        
        // insert M002
        List<String> nilaiDua = new ArrayList<String>();
        nilaiDua.add("Mr. Y");
        nilaiDua.add("Gold");
        
        // insert M003
        List<String> nilaiTiga = new ArrayList<String>();
        nilaiTiga.add("Mr. Z");
        nilaiTiga.add("Platinum");
        
        member.put("M001", nilaiSatu);
        member.put("M002", nilaiDua);
        member.put("M003", nilaiTiga);
    }
       
    // search data
    static void cariDataMember(String id) {                
        if(member.containsKey(id)) {   
            for(Map.Entry<String, List<String>> entry : member.entrySet()) {
                if(entry.getKey().equals(id)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\n| ID Member                        | : " + key);
                System.out.println("| Nama Member                      | : " + values.get(0));
                System.out.println("| Jenis Member                     | : " + values.get(1));
                
                }
            }
        } else {
                System.out.println("Belum terdaftar sebagai member");
        }
    }
    
    static String ambilJenisMember(String id) {
        
        String jenisMember = null;
        if(member.containsKey(id)) {
            for(Map.Entry<String, List<String>> entry : member.entrySet()) {
                if(entry.getKey().equals(id)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int lamaRental(int tglRental, int blnRental, int thnRental, int tglReturn, int blnReturn, int thnReturn) {
        
        if(thnReturn >= thnRental) {
            if(blnReturn >= blnRental) {
                
                    LocalDateTime rent = LocalDateTime.of(thnRental, blnRental, tglRental, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(thnReturn, blnReturn, tglReturn, 23, 59, 59);

                    Duration duration = Duration.between(rent, returned);
        
                    waktuRental = (int) duration.toDays();      
            } else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        } else {
            System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }
        
        return waktuRental;
    }
}
