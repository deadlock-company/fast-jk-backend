package com.deadlock.fastjk.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "product")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    @Column(name = "bar_code")
    private String barCode;

    private LocalDate createdAt;

}
