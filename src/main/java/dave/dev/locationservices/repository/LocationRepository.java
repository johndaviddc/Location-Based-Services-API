package dave.dev.locationservices.repository;

import dave.dev.locationservices.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
