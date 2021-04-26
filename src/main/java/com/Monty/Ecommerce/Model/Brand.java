package com.Monty.Ecommerce.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Brand")
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Brand_id")
    private long brand_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "PhotoURL")
    private String photoURL;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "Date_Created")
    private Date date_created;

    @Column(name = "Date_Updated")
    private Date date_updated;

    public Brand(String title, String photoURL, boolean isActive, Date date_created, Date date_updated) {
        this.title = title;
        this.photoURL = photoURL;
        this.isActive = isActive;
        this.date_created = date_created;
        this.date_updated = date_updated;
    }


    public String getTitle() {
        return title;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDate_created() {
        return date_created;
    }

    public Date getDate_updated() {
        return date_updated;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public void setDate_updated(Date date_updated) {
        this.date_updated = date_updated;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "Brand_id=" + brand_id +
                ", title='" + title + '\'' +
                ", photoURL='" + photoURL + '\'' +
                ", isActive=" + isActive +
                ", date_created=" + date_created +
                ", date_updated=" + date_updated +
                '}';
    }
}
