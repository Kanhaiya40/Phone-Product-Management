package com.webapp.derby.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Memory {
    @Id
    @GeneratedValue
    private int  meomoryId;
    private String ram;
    private String hardDisk;
    private String graphics;
}
