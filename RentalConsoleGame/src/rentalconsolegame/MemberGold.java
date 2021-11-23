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
        rentCost = 30000;
        point = 5;
        disc = 2;
        cashback = 5000;
    }
}
