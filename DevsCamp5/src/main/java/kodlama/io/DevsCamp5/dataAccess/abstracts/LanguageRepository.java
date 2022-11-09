package kodlama.io.DevsCamp5.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.DevsCamp5.entities.controllers.Languages;

public interface LanguageRepository extends JpaRepository<Languages,Integer>{

}
