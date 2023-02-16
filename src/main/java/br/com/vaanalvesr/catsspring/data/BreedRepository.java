package br.com.vaanalvesr.catsspring.data;

import br.com.vaanalvesr.catsspring.model.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BreedRepository extends JpaRepository<Breed, UUID> {
}
