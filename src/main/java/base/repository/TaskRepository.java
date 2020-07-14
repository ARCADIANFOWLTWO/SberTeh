package base.repository;

import org.springframework.data.repository.CrudRepository;
import base.domain.ListE;
import base.domain.TaskE;
import java.util.*;

public interface TaskRepository extends CrudRepository<TaskE, Long> {
    List<TaskE> findByList(ListE list);
}