package lgwarlick.cards.repository;

import lgwarlick.cards.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
