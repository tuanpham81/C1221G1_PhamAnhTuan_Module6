package com.codegym.models;

import javax.persistence.*;

@Entity
@Table(name = "medicine_prescription")
public class MedicinePrescription {
    @EmbeddedId
    private CompositeKeyMedicinePrescription medicinePrescriptionId;
    private Integer times;
    private Integer number_per_time;

    @ManyToOne
    @JoinColumn(name = "prescription_id")
    @MapsId("prescription")
    private Prescription prescription;

    @ManyToOne
    @JoinColumn(name = "medicine_id")
    @MapsId("medicine")
    private Medicine medicine;

    public MedicinePrescription() {
    }

    public MedicinePrescription(CompositeKeyMedicinePrescription medicinePrescriptionId, Integer times, Integer number_per_time, Prescription prescription, Medicine medicine) {
        this.medicinePrescriptionId = medicinePrescriptionId;
        this.times = times;
        this.number_per_time = number_per_time;
        this.prescription = prescription;
        this.medicine = medicine;
    }

    public CompositeKeyMedicinePrescription getMedicinePrescriptionId() {
        return medicinePrescriptionId;
    }

    public void setMedicinePrescriptionId(CompositeKeyMedicinePrescription medicinePrescriptionId) {
        this.medicinePrescriptionId = medicinePrescriptionId;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getNumber_per_time() {
        return number_per_time;
    }

    public void setNumber_per_time(Integer number_per_time) {
        this.number_per_time = number_per_time;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
