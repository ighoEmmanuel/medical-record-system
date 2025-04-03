package com.onemedic.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctors")

@Data
public class Doctor extends User {

    @Id
    private String id;
    private Specialization specialization;
    private Appointment appointment;
}
