package yoo.springframework5.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import yoo.springframework5.spring5recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
