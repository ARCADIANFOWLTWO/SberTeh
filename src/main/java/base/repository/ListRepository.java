package base.repository;

import base.domain.ListE;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<ListE, Long> {
   // ListE findById(long id);
}