package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> { // t stands for type of object, id is an int <T, ID>

	Iterable<Dwarf> findByAuthor(String author);

	Object findByDwarfId(Integer dwarfId);

	Object findByNameAndAuthor(String name, String author);

	
}
