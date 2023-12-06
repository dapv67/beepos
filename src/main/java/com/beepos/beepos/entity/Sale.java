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
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sale")
    private Long idSale;

    @ManyToOne
    @JoinColumn(name = "id_cash_cut", nullable = false)
    private CashCut cashCut;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee employee;

    @Column(name = "date_sale", columnDefinition = "DATETIME", nullable = false )
    private LocalDateTime dateSale;

    @Column(name = "total", columnDefinition = "Decimal(10,2)", nullable = false )
    private Double total;
}
