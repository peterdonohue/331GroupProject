/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadisonHotel;


public class ValueGuest extends Guest{
    private String savingsNumber;
    private int numberOfBookings;
    private double amountSpentWithHotel;
    
    public ValueGuest(String username, String password, String guestName) {
        super(username, password, guestName);
        this.savingsNumber = "";
        this.numberOfBookings = 0;
        this.amountSpentWithHotel = 0.0;
    }
    public double getAmountSpentWithHotel() {
        return this.amountSpentWithHotel;
    }
    public int getNumberOfBookings() {
        return this.numberOfBookings;
    }
    public String getSavingsNumber() {
        return this.savingsNumber;
    }
}
