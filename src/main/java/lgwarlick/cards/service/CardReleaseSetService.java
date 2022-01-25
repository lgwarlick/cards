package lgwarlick.cards.service;

import lgwarlick.cards.model.CardReleaseSet;

import java.util.Set;

public interface CardReleaseSetService {

    CardReleaseSet findByID(Long id);

    Set<CardReleaseSet> findAll();

}
