package com.codegym.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Medicine {
    @Id
    @Column(name = "medicine_id")
    private String medicineId;
    @OneToMany(mappedBy = "medicine")
    private Set<MedicinePrescription> medicinePrescriptions;
}
