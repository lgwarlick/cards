package lgwarlick.cards.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    /**
     * Find all objects of type T
     * @return a hash set of values from the hash-map
     */
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    /**
     *
     * @param id
     * @return the an object of type T from the map based off the id provided
     */
    T findById(ID id) {
        return map.get(id);
    }

    /*No plans for implementation at this time*/

    T save(ID id, T object){
        map.put(id, object);
        return object;
    }

    void delete(T object){
        map.entrySet().removeIf(entry ->entry.getValue().equals(object));
    }

    void deleteByID(ID id){
        map.remove(id);
    }

}
