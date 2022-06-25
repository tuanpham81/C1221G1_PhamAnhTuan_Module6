package com.codegym.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Prescription {

    private Boolean flag;
    @Id
    @Column(name = "prescription_id", columnDefinition = "VARCHAR(20)")
    private String prescriptionId;
    @Column(columnDefinition = "VARCHAR(100)")
    private String prescriptionName;
    @Column(columnDefinition = "VARCHAR(100)")
    private String symptom;
    @Column(columnDefinition = "VARCHAR(50)")
    private String object;
    private Integer numberOfDays;
    @OneToMany(mappedBy = "prescription")
    private Set<MedicinePrescription> medicinePrescriptions;
}
