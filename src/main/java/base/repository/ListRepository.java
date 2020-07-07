package base.repository;

import base.domain.List;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<List, Long> {

}