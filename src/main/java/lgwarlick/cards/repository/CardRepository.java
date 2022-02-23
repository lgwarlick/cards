package lgwarlick.cards.repository;

import lgwarlick.cards.model.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CardRepository extends CrudRepository<Card, Long> {

    Optional<Card> findCardByName(String name);
}
