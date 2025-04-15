/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class User {
    private static User instance;
    

    static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String Username;
    private String Password;
    
    public User() {
        
    }
    public static User getinstance() {
        if(instance == null) {
            instance = new User();
        }
        return instance;
    }
    public void setCredentials(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    public boolean checkCredentials(String Username, String Password) {
        return this.Username != null && this.Username.equals(Username) && this.Password != null && this.Password.equals(Password);
    }
    
    public String getUsername() {
        return Username;
    }
    
    public String getPassword(){
        return Password;
        
    }
}