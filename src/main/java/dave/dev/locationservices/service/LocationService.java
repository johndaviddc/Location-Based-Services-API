package dave.dev.locationservices.service;

import dave.dev.locationservices.model.Location;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface LocationService {
    List<Location> getAllLocations();
    Location getLocationById(Long id);
    Location createLocation(Location location);
    void deleteLocation(Long id);
}
