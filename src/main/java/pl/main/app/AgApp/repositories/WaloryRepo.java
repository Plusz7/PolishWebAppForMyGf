package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Walory;

public interface WaloryRepo extends JpaRepository<Walory, Long> {
}
