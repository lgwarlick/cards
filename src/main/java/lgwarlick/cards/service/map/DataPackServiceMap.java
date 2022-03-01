package lgwarlick.cards.service.map;

import lgwarlick.cards.model.DataPack;
import lgwarlick.cards.service.DataPackService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DataPackServiceMap extends AbstractMapService<DataPack, Long> implements DataPackService {


    @Override
    public Set<DataPack> findAll() {
        return super.findAll();
    }

    @Override
    public DataPack findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(DataPack dataPack) {
        super.delete(dataPack);
    }

    @Override
    public DataPack save(DataPack dataPack) {
        return super.save(dataPack);
    }
}
