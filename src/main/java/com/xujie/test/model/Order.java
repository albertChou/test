package com.xujie.test.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "`ORDER`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String recipient_name;

    @Column(length = 20)
    private String recipient_tel;

    @Column(length = 200)
    private String order_name;

    @Column(length = 20)
    private String order_tel;

    private Date order_date;

    @Column(length = 200)
    private String product_name;

    private int amount;
}
