package lgwarlick.cards.service.h2;

import lgwarlick.cards.model.DataPack;
import lgwarlick.cards.repository.DataPackRepository;
import lgwarlick.cards.service.DataPackService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Primary
public class DataPackServiceH2 implements DataPackService {


    private final DataPackRepository dataPackRepository;

    public DataPackServiceH2(DataPackRepository dataPackRepository) {
        this.dataPackRepository = dataPackRepository;
    }

    @Override
    public Set<DataPack> findAll() {

        Iterable<DataPack> findAllReleaseSets = dataPackRepository.findAll();
        Set<DataPack> allReleaseSets = new HashSet<>();
        findAllReleaseSets.forEach(allReleaseSets::add);
        return allReleaseSets;

    }

    @Override
    public DataPack findByID(Long aLong) {
        return null;
    }

    @Override
    public DataPack save(DataPack object) {
        return dataPackRepository.save(object);
    }

    @Override
    public void delete(DataPack object) {
        dataPackRepository.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        dataPackRepository.deleteById(id);
    }
}
