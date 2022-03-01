package lgwarlick.cards.bootstrap;

import lgwarlick.cards.model.Card;
import lgwarlick.cards.model.DataPack;
import lgwarlick.cards.model.CardType;
import lgwarlick.cards.model.Faction;
import lgwarlick.cards.repository.DataPackRepository;
import lgwarlick.cards.repository.CardRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final CardRepository cardRepository;
    private final DataPackRepository dataPackRepository;

    public DataLoader(CardRepository cardRepository, DataPackRepository dataPackRepository) {
        this.cardRepository = cardRepository;
        this.dataPackRepository = dataPackRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {


        /**
         * CARDS
         */

        Card card1 = new Card();
        card1.setName("Breaking News");
        card1.setFaction(Faction.NBN);
        card1.setCardType(CardType.AGENDA);
        card1.setAdvancementRequirement(2);
        card1.setAgendaPoints(1);
        card1.setCardText("When you score Breaking News, give the Runner 2 tags.\n" +
                "\n" +
                "When the turn on which you scored Breaking News ends, the Runner loses 2 tags.");

        cardRepository.save(card1);

        Card card2 = new Card();
        card2.setName("Hedge Fund");
        card2.setCardType(CardType.OPERATION);
        card2.setFaction(Faction.NEUTRAL);
        card2.setPlayCost(5);
        card2.setCardText("Gain 9 credit.");

        cardRepository.save(card2);

        Card card3 = new Card();
        card3.setName("Government Contracts");
        card3.setFaction(Faction.WEYLAND_CONSORTIUM);
        card3.setCardType(CardType.AGENDA);
        card3.setAgendaPoints(3);
        card3.setAdvancementRequirement(5);
        card3.setCardText("Spend 2: Gain 4");

        cardRepository.save(card3);

        Card card4 = new Card();
        card4.setName("Diesel");
        card4.setCardType(CardType.EVENT);
        card4.setFaction(Faction.SHAPER);
        card4.setPlayCost(0);
        card4.setCardText("Draw 3 cards");

        cardRepository.save(card4);

        Card card5 = new Card();
        card5.setName("Gordian Blade");
        card5.setCardType(CardType.PROGRAM);
        card5.setFaction(Faction.SHAPER);
        card5.setInstallCost(4);
        card5.setMemoryCost(1);
        card5.setStrength(2);
        card5.setCardText("1: Break code gate subroutine. 1: +1 strength for remainder of this run");

        cardRepository.save(card5);

        Card card6 = new Card();
        card6.setName("Hedge Fund");
        card6.setFaction(Faction.NEUTRAL);
        card6.setCardType(CardType.OPERATION);
        card6.setPlayCost(5);
        card6.setCardText("Gain 9");

        cardRepository.save(card6);

        Card card7 = new Card();
        card7.setName("Special Order");
        card7.setCardType(CardType.EVENT);
        card7.setFaction(Faction.CRIMINAL);
        card7.setPlayCost(1);
        card7.setCardText("Search your stack for an icebreaker, reveal is, and add it to your grip. Shuffle your stack.");

        cardRepository.save(card7);

        Card card8 = new Card();
        card8.setName("Public Sympathy");
        card8.setCardType(CardType.RESOURCE);
        card8.setFaction(Faction.NEUTRAL);
        card8.setPlayCost(2);
        card8.setCardText("Your maximum hand size is increased by 2");

        cardRepository.save(card8);

        Card card9 = new Card();
        card9.setName("Weyland Consortium");
        card9.setCardType(CardType.CORPORATIONIDENTITY);
        card9.setFaction(Faction.WEYLAND_CONSORTIUM);
        card9.setMinimumDeckSize(45);
        card9.setInfluenceLimit(15);
        card9.setCardText("Gain 1 whenever you play a transaction operation");

        cardRepository.save(card9);

        Card card10 = new Card();
        card10.setName("Wall of Static");
        card10.setCardType(CardType.ICE);
        card10.setFaction(Faction.NEUTRAL);
        card10.setRezCost(3);
        card10.setStrength(3);
        card10.setCardText("End the run");

        cardRepository.save(card10);

        /**
         * SETS
         */

        DataPack set1 = new DataPack();
        set1.setName("What Lies Ahead");
        set1.setReleaseDate("December 2012");


        dataPackRepository.save(set1);

        DataPack set2 = new DataPack();
        set2.setName("Trace Amounts");
        set2.setReleaseDate("January 2013");

        dataPackRepository.save(set2);

    }

}
