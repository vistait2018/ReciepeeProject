package com.vista.receipee.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    private Receipee receipee;

    @Lob
    private String recipeeNotes;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Receipee getReceipee() {
        return receipee;
    }

    public void setReceipee(Receipee receipee) {
        this.receipee = receipee;
    }

    public String getRecipeeNotes() {
        return recipeeNotes;
    }

    public void setRecipeeNotes(String recipeeNotes) {
        this.recipeeNotes = recipeeNotes;
    }
}
