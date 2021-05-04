package com.Monty.Ecommerce.Vendor.Entity;

import com.Monty.Ecommerce.User.Entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

@Entity
@Table(name = "vendor")
@NoArgsConstructor
@Data
public class Vendor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vendor_id")
    private UUID vendorId;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "date_created")
    private Calendar dateCreated;

    @Column(name = "date_updated")
    private Calendar dateUpdated;

    @OneToOne
    @JoinColumn(name = "vendor_id")
    private User user;

    public Vendor(String vendorName, boolean isActive, Calendar dateCreated, Calendar dateUpdated) {

        this.vendorName = vendorName;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
}
