package lgwarlick.cards.service.map;

import lgwarlick.cards.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

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
     * @return an object of type T from the map based off the id provided
     */
    T findById(ID id) {
        return map.get(id);
    }

    /*No plans for implementation at this time*/

    T save(T object){
        if(object != null){
           if (object.getId() == null){
               object.setId(getNextId());
           }
           map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    /**
     * Auto increments map ID generation
     * @return
     */
    private Long getNextId(){

        Long nextId = null;
       try {
           nextId = Collections.max(map.keySet()) +1;
       } catch (NoSuchElementException e) {
           nextId = 1L;
       }
        return nextId;
    }

}
