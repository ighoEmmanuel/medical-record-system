package com.onemedic.models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "patients")

@Data
public class Patient extends User {

    @Id
    private String id;
    private Appointment appointment;

}
