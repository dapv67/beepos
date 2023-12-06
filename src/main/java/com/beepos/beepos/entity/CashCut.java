package com.beepos.beepos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cash_cuts")
public class CashCut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cash_cut")
    private Long idCashCut;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee employee;

    @Column(name = "date_cue_start", columnDefinition = "DATETIME", nullable = false )
    private LocalDateTime dateCuteStart;

    @Column(name = "date_cut_end", columnDefinition = "DATETIME")
    private LocalDateTime dateCuteEnd;

    @Column(name = "total_cash", columnDefinition = "Decimal(10,2)", nullable = false )
    private Double totalCash;
}
