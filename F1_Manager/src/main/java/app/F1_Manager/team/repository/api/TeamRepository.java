package app.F1_Manager.team.repository.api;

import app.F1_Manager.person.repository.entity.Person;
import app.F1_Manager.team.repository.entity.Team;
import app.F1_Manager.team.repository.entity.TeamPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TeamRepository extends JpaRepository<Team, UUID> {

    @Query("SELECT m.person FROM Team t JOIN t.members m WHERE m.teamRole = :role")
    List<Person> findPeopleByRole(
            @Param("role") TeamPerson.TeamRole role
    );

    @Query("SELECT t FROM Team t WHERE t.budget > :budget")
    List<Team> findTeamsWithBudgetGreaterThan(
      @Param("budget") long budget
    );
}
