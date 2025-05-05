// com/workintech/s18d1/entity/Burger.java
package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private Boolean isVegan;

    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    private String contents;
}
