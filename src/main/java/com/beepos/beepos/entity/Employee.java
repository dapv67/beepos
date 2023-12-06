package com.beepos.beepos.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee", nullable = false)
    private Long idEmployee;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "nickname",nullable = false, length = 25,unique=true)
    private String nickname;

    @Column(name = "password",nullable = false, length = 65)
    private String password;

    @Column(name = "type_user",nullable = false, length = 15)
    private String typeUser;
}
