/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author ASUS
 */
public class MemberSilver {
    // atribut
    protected int biayaRental, jumlahPoint, discount, tempCost, totalDiskon, totalBiaya;
    
    
    // constructor
    MemberSilver() {
        this.biayaRental = 25000;
        this.jumlahPoint = 1;
        this.discount = 1;
    }
    
    protected int biayaTotal(int lamaRental) {
        
        tempCost = lamaRental * biayaRental;
        totalDiskon = (tempCost * discount) / 100;
        totalBiaya = tempCost - totalDiskon;
        
        return totalBiaya;
    }
    
    protected int perolehanPoint(int lamaRental) {
        
        int totalPoint = lamaRental * jumlahPoint;
        return totalPoint;
    }
    
}
