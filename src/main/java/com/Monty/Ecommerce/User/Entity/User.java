package com.Monty.Ecommerce.User.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "login_username")
    private String loginUsername;

    @Column(name = "login_password")
    private String loginPassword;

    @Column(name = "email")
    private String email;

    @Column(name = "is_superadmin")
    private boolean isSuperAdmin;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "date_created")
    private Calendar dateCreated;

    @Column(name = "date_updated")
    private Calendar dateUpdated;

    public User(String loginUsername, String loginPassword, String email, boolean isSuperAdmin, boolean isActive, Calendar dateCreated, Calendar dateUpdated) {

        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
        this.email = email;
        this.isSuperAdmin = isSuperAdmin;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;

    }



}
