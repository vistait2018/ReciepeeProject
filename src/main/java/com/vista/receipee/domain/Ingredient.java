package com.vista.receipee.domain;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
public class Ingredient {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Description;
    private BigDecimal amount;
    //private unitOfMeasure uom;
    @ManyToOne
    private Receipee receipee;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Receipee getReceipee() {
        return receipee;
    }

    public void setReceipee(Receipee receipee) {
        this.receipee = receipee;
    }
}
