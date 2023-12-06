package com.beepos.beepos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier", nullable=false)
    private Long idSupplier;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(length = 42)
    private String phone;
}
