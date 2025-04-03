package com.onemedic.models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document(collection = "patients")
public class Patient extends User {

    @Id
    private String id;
    private List<Appointment> appointment;
    private final MedicalRecord medicalRecord;
}
