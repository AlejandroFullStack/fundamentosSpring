package com.fundamentos.sprinboot.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix="user")
public class UserPojo {

    private String nombre;
    private String email;
    private int age;


    public UserPojo(String nombre, String email, int age) {
        this.nombre = nombre;
        this.email = email;
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
