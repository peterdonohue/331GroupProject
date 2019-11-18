/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadisonHotel;


public class Employee {
    private int employeeID;
    private String username;
    private String password;
    private String employeeName;
    public static int nextID = 0;
    
    public Employee(String username, String password, String employeeName){
        this.username = username; 
        this.password = password; 
        this.employeeName = employeeName;
        this.employeeID = nextID++;
    }
    public boolean checkCredentials(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) 
            return true;
        else
           return false; 
    }
    public String getEmployeeName() {
        return this.employeeName;
    }
    public String getUsername() {
        return this.username;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int setPassword(String oldP, String newP) {
        return 0;
    }
}
