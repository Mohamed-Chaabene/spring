package tn.esprit.arctic1.arctic1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.arctic1.arctic1.Entity.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor,Long> {
}

