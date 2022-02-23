package lgwarlick.cards.repository;

import lgwarlick.cards.model.CardReleaseSet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CardReleaseSetRepository extends CrudRepository<CardReleaseSet, Long> {

    Optional<CardReleaseSet> findCardReleaseSetByName(String name);

}
