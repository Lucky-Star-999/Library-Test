/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

/**
 *
 * @author ASUS
 */
public abstract class User {
    //Personal information
    private String username;
    private String password;
    private String email;
    private String phone;
    private String fullName;
    
    //Link of the image in avatar
    private String linkOfAvatar;
    
    //Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLinkOfAvatar() {
        return linkOfAvatar;
    }

    public void setLinkOfAvatar(String linkOfAvatar) {
        this.linkOfAvatar = linkOfAvatar;
    }
    //End of getters and setters
    
    
    
}
