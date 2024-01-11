package dave.dev.locationservices.service;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {
    Task scheduleTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    void deleteTask(Long id);
}
