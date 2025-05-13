package app.F1_Manager.team.repository.entity;

import app.F1_Manager.person.repository.entity.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teams")
public class Team {

    @Id
    private UUID id;
    private String teamName;
    private String country;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private List<TeamPerson> members;
    private long budget;
    private int yearOfEstablishment;

}
