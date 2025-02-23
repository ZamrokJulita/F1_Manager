package app.F1_Manager.track.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tracks")
public class Track {

    @Id
    private UUID id;
    private String trackName;
    private String country;
    private double trackLengthInKilometers;
    private int numberOfLaps;

}
