package lgwarlick.cards.bootstrap;

import lgwarlick.cards.model.CardReleaseSet;
import lgwarlick.cards.service.CardReleaseSetService;
import lgwarlick.cards.service.map.CardReleaseSetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

private final CardReleaseSetService cardReleaseSetService;

    public DataLoader(CardReleaseSetService cardReleaseSetService) {
        this.cardReleaseSetService = cardReleaseSetService;
    }

    @Override
    public void run(String... args) throws Exception {

        CardReleaseSet release1 = new CardReleaseSet();
        release1.setId(1L);
        release1.setName("What Lies Head");
        release1.setReleaseDate("December 2012");
        cardReleaseSetService.save(release1);


        CardReleaseSet release2 = new CardReleaseSet();
        release2.setId(2L);
        release2.setName("Trace Amounts");
        release2.setReleaseDate("January 2013");
        cardReleaseSetService.save(release2);

        CardReleaseSet release3 = new CardReleaseSet();
        release3.setId(3L);
        release3.setName("Cyber Exodus");
        release3.setReleaseDate("February 2013");
        cardReleaseSetService.save(release3);
    }
}
