/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shakt
 */
public class EmployeeDirectory {
    ArrayList<Employee> allUsers;

    public EmployeeDirectory() {
        this.allUsers = new ArrayList<>();
    }
    
    

    public ArrayList<Employee> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<Employee> allUsers) {
        this.allUsers = allUsers;
    }
    
      public void addUser(Employee newUser){
        this.allUsers.add(newUser);
    }
    
    public void removeUser(Employee user){
        this.allUsers.remove(user);
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "allUsers=" + allUsers + '}';
    }
    
    
}
