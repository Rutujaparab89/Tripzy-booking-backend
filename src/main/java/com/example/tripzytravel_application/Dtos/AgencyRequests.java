package com.example.tripzytravel_application.Dtos;

import com.example.tripzytravel_application.Validator.Email;

import jakarta.validation.constraints.NotNull;

public class AgencyRequests {
    @NotNull(message = "Email cannot be null")
    @Email(message = "Invalid email format")
    private String email;

    //Getter and Setter
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
}
