package com.kodilla.good.patterns.challenges.ProductOrderService;

public class User {
    private String username;
    private String firstName;
    private String familyName;
    private String adress;
    private String phoneNumber;
    private String emailAdress;


    public User(String username, String firstName, String familyName,
                String adress, String emailAdress, String phoneNumber) {
        this.username = username;
        this.firstName = firstName;
        this.familyName = familyName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public String getUsername() {
        return username;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public String getAdress() {
        return adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmailAdress() {
        return emailAdress;
    }

}
