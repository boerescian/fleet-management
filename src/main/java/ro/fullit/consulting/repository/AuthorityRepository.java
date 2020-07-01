package ro.fullit.consulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fullit.consulting.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
