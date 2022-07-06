package ru.dmitryk.kataprojects.web.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    @NotEmpty(message = "Имя не должно быть пустым")
    private String name;
    @Column(name = "age")
    @Min(value = 0, message = "Возраст не может быть меньше ноля")
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + "; ";
    }
}
