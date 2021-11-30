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
public class MemberGold extends MemberSilver{
    int cashback;
    
    MemberGold() {
        biayaRental = 30000;
        jumlahPoint = 5;
        discount = 2;
        cashback = 5000;
    }
}
