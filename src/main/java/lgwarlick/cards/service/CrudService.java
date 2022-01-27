package lgwarlick.cards.service;

import java.util.Set;

/**
 * Common base interface for other service interfaces to build upon
 * @param <T> object of type T
 * @param <ID> id value of type ID
 */

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);

}
