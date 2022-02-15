package lgwarlick.cards.bootstrap;

import lgwarlick.cards.model.Card;
import lgwarlick.cards.model.CardReleaseSet;
import lgwarlick.cards.model.CardType;
import lgwarlick.cards.model.Faction;
import lgwarlick.cards.service.CardReleaseSetService;
import lgwarlick.cards.service.CardService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

private final CardReleaseSetService cardReleaseSetService;
private final CardService cardService;

    public DataLoader(CardReleaseSetService cardReleaseSetService, CardService cardService) {
        this.cardReleaseSetService = cardReleaseSetService;
        this.cardService = cardService;
    }

    @Override
    public void run(String... args) throws Exception {

        CardReleaseSet release1 = new CardReleaseSet();
        release1.setName("What Lies Head");
        release1.setReleaseDate("December 2012");
        cardReleaseSetService.save(release1);

        CardReleaseSet release2 = new CardReleaseSet();
        release2.setName("Trace Amounts");
        release2.setReleaseDate("January 2013");
        cardReleaseSetService.save(release2);

        CardReleaseSet release3 = new CardReleaseSet();
        release3.setName("Cyber Exodus");
        release3.setReleaseDate("February 2013");
        cardReleaseSetService.save(release3);

        Card card1 = new Card();
        card1.setName("Acme Consulting");
        card1.setCardType(CardType.CORPORATION_IDENTITY);
        card1.setFaction(Faction.NBN);
        card1.setCardText("The Runner is considered to have 1 additional tag (even if they have 0) during encounters with the outermost piece of ice protecting any server.");
        cardService.save(card1);

        Card card2 = new Card();
        card2.setName("Armitage Codebusting");
        card2.setCardType(CardType.RESOURCE);
        card2.setFaction(Faction.NEUTRAL);
        card2.setCardText("Place 12 from the bank on Armitage Codebusting");
        card2.setInstallCost(1);
        cardService.save(card2);
    }
}
