package com.webapp.derby.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Phone {
    @Id
    @GeneratedValue
    private int productSerialNo;
    private String model;
    private String version;
    private  String battery;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Memory> memory;
}
