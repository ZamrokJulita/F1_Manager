package app.F1_Manager;

import app.F1_Manager.person.repository.api.PersonRepository;
import app.F1_Manager.person.repository.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class F1ManagerApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(F1ManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UUID uuid = UUID.randomUUID();
		Person p = Person.builder().surname("DTGDF")
				.id(uuid)
				.name("da")
				.build();
		repository.save(p);
		Optional<Person> per = repository.findById(uuid);
		System.out.println(); // use .orElse() to handle optional
	}

}
