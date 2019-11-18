/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadisonHotel;


public class Guest {
    private int guestID;
    private String username;
    private String password;
    private String guestName;
    public static int nextID = 0;
    
    public Guest(String username, String password, String guestName) {
        this.username = username;
        this.password = password;
        this.guestName = guestName;
        this.guestID = nextID++;
    }
    public boolean checkCredentials(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password))
            return true;
        else
            return false;
    }
    public String getGuestName() {
        return this.guestName;
    }
    public String getUsername() {
        return this.username;
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    public int setPassword(String oldP, String newP) {
        return 0;
    }
}
