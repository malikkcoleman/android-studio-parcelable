package com.example.co_op_learning_parcelable;

import org.parceler.Parcel;

@Parcel // ** Required ** Must annotate class with @Parcel
public class User {

    // ** Required ** Field cannot be private
    String userName;
    int userAge;

    public User() {
    }

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
