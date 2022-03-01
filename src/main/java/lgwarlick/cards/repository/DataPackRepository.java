package lgwarlick.cards.repository;

import lgwarlick.cards.model.DataPack;
import org.springframework.data.repository.CrudRepository;

public interface DataPackRepository extends CrudRepository<DataPack, Long> {

    DataPack findCardReleaseSetByName(String name);

}
