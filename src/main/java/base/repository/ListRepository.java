package base.repository;

import org.springframework.data.repository.CrudRepository;
import base.domain.List;

public interface ListRepository extends CrudRepository<List, Long> {
}