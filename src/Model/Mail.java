/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author danie
 */
public class Mail {
    public Mail(String mail) {
        this.mail = mail;
    }
     public String getMail() {
        return mail;
    }
    public String getDomain(){
        String [] domain=mail.split("@");
        return domain[1];
    }
     private String mail;
}
