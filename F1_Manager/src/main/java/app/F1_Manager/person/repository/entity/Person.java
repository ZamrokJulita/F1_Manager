package app.F1_Manager.person.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "persons")
@AllArgsConstructor
@Builder
public class Person {

    @Id
    private UUID id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private String nationality;

}
