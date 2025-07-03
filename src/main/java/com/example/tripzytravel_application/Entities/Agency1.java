package com.example.tripzytravel_application.Entities;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.tripzytravel_application.Validator.Email;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Agency1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull @NotEmpty
    @Size(min = 4,max=20 ,message ="Agency name must be 4 and 20 characters")
    private String agencyname;
    @NotNull @NotEmpty
    private String status;
    @NotNull @NotEmpty
    private String contactnumber;
    @NotEmpty(message = "Email must not be empty")
    @Email(message = "Invalid email format")
    private String email;
    @NotNull @NotEmpty
    private String bookingservice;
    @NotNull @NotEmpty
    @Pattern(regexp = "(Cash|Card|Digitalwallet|Checks)(,(Cash|Cards|Digitalwallets|Checks))+", 
         message = "Payment term must be at least two of the allowed values: Cash, Card, Digitalwallet, Checks")
    private String paymentterm;

    @CreatedDate
    private Instant CreatedAt;
    @LastModifiedDate
    private Instant ModifiedAt;
}
