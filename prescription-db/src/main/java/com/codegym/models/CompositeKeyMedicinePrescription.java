package com.codegym.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompositeKeyMedicinePrescription implements Serializable {
    @Column(name = "prescription_id")
    String prescription_id;
    @Column(name = "medicine_id")
    String medicine_id;

    public CompositeKeyMedicinePrescription() {
    }

    public CompositeKeyMedicinePrescription(String prescription_id, String medicine_id) {
        this.prescription_id = prescription_id;
        this.medicine_id = medicine_id;
    }

    public String getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(String prescription_id) {
        this.prescription_id = prescription_id;
    }

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeyMedicinePrescription that = (CompositeKeyMedicinePrescription) o;
        return Objects.equals(prescription_id, that.prescription_id) &&
                Objects.equals(medicine_id, that.medicine_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescription_id, medicine_id);
    }
}
