package in.youssef.springboot.repository;

import in.youssef.springboot.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Note,Long> {

}
