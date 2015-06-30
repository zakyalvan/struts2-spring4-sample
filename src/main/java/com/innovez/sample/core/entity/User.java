package com.innovez.sample.core.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * User entity.
 *
 * @author zakyalvan
 */
@Entity
@Table(name = "innvz_user")
@SuppressWarnings("serial")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "username")
    private String username;

    @Version
    @Column(name = "record_version")
    private Integer version;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getVersion() {
        return version;
    }
}
