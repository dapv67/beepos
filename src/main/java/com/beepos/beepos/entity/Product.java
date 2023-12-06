package com.beepos.beepos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long idProduct;

    @ManyToOne
    @JoinColumn(name = "id_supplier", nullable = false)
    private Supplier supplier;

    @Column(name = "name", length = 120, nullable = false)
    private String name;

    @Column(name = "price", columnDefinition = "Decimal(10,2)", nullable = false)
    private Double price;

    @Column(name = "stock", columnDefinition = "Decimal(10,2)", nullable = false)
    private Double stock;



    // Getters and setters
}

