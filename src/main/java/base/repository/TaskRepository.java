package base.repository;

import org.springframework.data.repository.CrudRepository;
import base.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}