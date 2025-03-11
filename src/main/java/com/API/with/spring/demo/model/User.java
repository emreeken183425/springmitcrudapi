package com.API.with.spring.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @NaturalId(mutable = true)
    private String email;
    private String password;
    private String department;

    //Getter methodlari

    public Long getId(){return id; }
    public String getUsername(){return username;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public String getDepartment(){return department; }

    //Setter methodlari
    public void setId(Long id){this.id=id; }
    public void setUsername(String username){this.username=username; }
    public void setEmail(String email){this.email=email; }
    public void setPassword(String password){this.password=password;}
    public void setDepartment(String department){this.department=department;}









}
