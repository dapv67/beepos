package com.beepos.beepos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "details_sale")
public class DetailsSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_details_sale")
    private Long idDetailsSale;

    @ManyToOne
    @JoinColumn(name = "id_sale", nullable = false)
    private Sale idSale;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product idProduct;

    @Column(name = "quantity", columnDefinition = "Decimal(10,2)", nullable = false )
    private Double quantity;

    @Column(name = "unit_price", columnDefinition = "Decimal(10,2)", nullable = false )
    private Double unit_price;

    @Column(name = "subtotal", columnDefinition = "Decimal(10,2)", nullable = false )
    private Double subtotal;
}
