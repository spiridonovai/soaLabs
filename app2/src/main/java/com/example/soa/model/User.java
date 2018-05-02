package com.example.soa.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    public String firstName;
    public String lastName;
    public String embg;
    public String username;
    public String password;
    public String email;
    public Date birthday;
    public Date emplDate;

    @ManyToOne
    public Role role;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String embg, String username, String password, String email, Date birthday, Date emplDate, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.embg = embg;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.emplDate = emplDate;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmbg() {
        return embg;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @JsonSerialize(using=DateSerializer.class)
    public Date getBirthday() {
        return birthday;
    }

    @JsonSerialize(using=DateSerializer.class)
    public Date getEmplDate() {
        return emplDate;
    }

    public Role getRole() {
        return role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmbg(String embg) {
        this.embg = embg;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setEmplDate(Date emplDate) {
        this.emplDate = emplDate;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
