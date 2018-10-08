package com.example.adil.help;

public class Userinformations {
    public String email,password;

    public Userinformations(String email,String password) {

        this.email=email;
        this.password=password;

    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
