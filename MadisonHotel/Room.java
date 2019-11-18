/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadisonHotel;


public class Room {
    public int bedOption;
    public int kitchenOption;
    public int coffeeOption;
    public int accessibleOption;
    public int roomNumber;
    private int roomID;
    private int roomBookQuantity;
    private boolean roomBooked;
    public double roomCostPerNight;
    public static int nextID = 0;
    
    public Room(int bed, int kitch, int coffee, int accessibility, int roomNumber) {
        this.bedOption = bed;
        this.kitchenOption = kitch;
        this.coffeeOption = coffee;
        this.accessibleOption = accessibility;
        this.roomNumber = roomNumber;
        this.roomID = nextID++;
        this.roomBookQuantity = 0; //Placeholder
        this.roomBooked = false;
        this.roomCostPerNight = 0.0; //Placeholder
        
    }
    public boolean bookRoom() {
        if (this.roomBooked) 
            return false;
        else {
            this.roomBooked = true;
            return true;
        }      
    }
    public void freeThisRoom() {
        this.roomBooked = false;
    }
    public int getRoomBookedQuantity() {
        return this.roomBookQuantity;
    }
    public int getRoomID() {
        return this.roomID;
    }
    public int getRoomNumber() {
        return this.roomNumber;
    }
    public String roomAnalytics() {
        return "Room Number: " + this.getRoomNumber() 
                + ", Number of Times Booked: " + this.getRoomBookedQuantity() 
                + "Booked? - " + this.roomBooked;
    }
    public String roomDescription() {
        return "";
    }
    public boolean setRoomNumber(int roomNumber) {
        return false;
    }
}
