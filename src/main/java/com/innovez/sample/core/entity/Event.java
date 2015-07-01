package com.innovez.sample.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zakyalvan
 */
@Entity
@Table(name = "innvz_event")
@SuppressWarnings("serial")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private String name;
    private Date startDate;

    private User owner;

    @Version
    @Column(name = "record_version")
    private Integer version;
}
