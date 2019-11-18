/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadisonHotel;


public class Booking {
    public Room bookedRoom;
    public Guest bookingGuest;
    public int bookingYear;
    public int checkInDay;
    public int checkOutDay;
    public static int nextID = 0;
    
    public Booking(Guest bookingGuest, Room bookedRoom, int year, int checkIn, int checkOut) {
        this.bookedRoom = bookedRoom;
        this.bookingGuest = bookingGuest;
        this.checkInDay = checkIn;
        this.checkOutDay = checkOut;
        //Put in dummy date for each Booking event. Booking constructor will call the appropriate method in Room to book it as well. 
    }
    public void endBooking() {
        
    }
}
