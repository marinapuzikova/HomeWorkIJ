package com.syntax.HomeWork19;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int mobileNumber;

    UserClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class UserInfo extends UserClass {
    String userAddress;

    UserInfo(String name, int mobileNumber) {
        super(name, mobileNumber);
    }

    void userDetails() {
        System.out.println("Name: " + name + ", Mobile number: " + mobileNumber + ", Address: " + userAddress);
    }
}
