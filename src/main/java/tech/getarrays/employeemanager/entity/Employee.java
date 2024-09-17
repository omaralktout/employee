package tech.getarrays.employeemanager.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;

    private String name;
    private String email;

    private String jopTitel;
    private String phone;

    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJopTitel() {
        return jopTitel;
    }

    public void setJopTitel(String jopTitel) {
        this.jopTitel = jopTitel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }


    public Employee (){}

    public Employee(long id, String name, String email, String jopTitel, String phone, String imageUrl,
            String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jopTitel = jopTitel;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jopTitel=" + jopTitel + ", phone="
                + phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + "]";
    }

}
