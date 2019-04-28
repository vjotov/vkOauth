package com.jotov.vkOauth.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "usr")
@Data
@EqualsAndHashCode(of = {"id"})
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String vkId;
    private String firstName;
    private String lastName;
//    private String closed
}
