package com.xujie.test.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "`MEMBER`")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String email;

    @Column(length = 200)
    private String name;

    @Column(length = 10)
    private String password;



}
