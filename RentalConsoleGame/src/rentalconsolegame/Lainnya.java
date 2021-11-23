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
    static Map<String, List<String>> dataMember = new HashMap<String, List<String>>();
    static int rentTime;
    
    // insert data member 
    static void insertMember() {
        
        // insert M001
        List<String> valueOne = new ArrayList<String>();
        valueOne.add("Mr. X");
        valueOne.add("Silver");
        
        // insert M002
        List<String> valueTwo = new ArrayList<String>();
        valueTwo.add("Mr. Y");
        valueTwo.add("Gold");
        
        // insert M003
        List<String> valueThree = new ArrayList<String>();
        valueThree.add("Mr. Z");
        valueThree.add("Platinum");
        
        dataMember.put("M001", valueOne);
        dataMember.put("M002", valueTwo);
        dataMember.put("M003", valueThree);
    }
       
    // search data
    static void searchMember(String idMember) {                
        if(dataMember.containsKey(idMember)) {   
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
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
    
    static String getJenisMember(String idMember) {
        
        String jenisMember = null;
        if(dataMember.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int rentDuration(int dateRent, int monthRent, int yearRent, int dateReturn, int monthReturn, int yearReturn) {
        
        if(yearReturn >= yearRent) {
            if(monthReturn >= monthRent) {
                
                    LocalDateTime rent = LocalDateTime.of(yearRent, monthRent, dateRent, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(yearReturn, monthReturn, dateReturn, 23, 59, 59);

                    Duration duration = Duration.between(rent, returned);
        
                    rentTime = (int) duration.toDays();      
            } else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        } else {
            System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }
        
        return rentTime;
    }
}
