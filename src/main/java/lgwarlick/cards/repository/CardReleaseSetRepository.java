package lgwarlick.cards.repository;

import lgwarlick.cards.model.CardReleaseSet;
import org.springframework.data.repository.CrudRepository;

public interface CardReleaseSetRepository extends CrudRepository<CardReleaseSet, Long> {

    CardReleaseSet findCardReleaseSetByName(String name);

}
