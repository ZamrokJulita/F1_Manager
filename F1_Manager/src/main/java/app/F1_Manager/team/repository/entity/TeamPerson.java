package app.F1_Manager.team.repository.entity;

import app.F1_Manager.person.repository.entity.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teamsPersons")
public class TeamPerson {

    public enum TeamRole{
        DIRECTOR,
        DRIVER,
        MECHANIC
    }
    @Id
    private UUID id;
    private LocalDate startContractDate;
    private LocalDate finishContractDate;
    private int salaryInEuros;
    private TeamRole teamRole;
    @ManyToOne
    @JoinColumn(name="person")
    private Person person;

}
