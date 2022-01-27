package lgwarlick.cards.bootstrap;

import lgwarlick.cards.model.CardReleaseSet;
import lgwarlick.cards.service.CardReleaseSetService;
import lgwarlick.cards.service.map.CardReleaseSetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

private final CardReleaseSetService cardReleaseSetService;

    public DataLoader() {
        cardReleaseSetService = new CardReleaseSetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        CardReleaseSet release1 = new CardReleaseSet();
        release1.setId(1L);
        release1.setName("What Lies Head");
        cardReleaseSetService.save(release1);


        CardReleaseSet release2 = new CardReleaseSet();
        release2.setId(2L);
        release2.setName("Trace Amounts");
        cardReleaseSetService.save(release2);

        CardReleaseSet release3 = new CardReleaseSet();
        release3.setId(3L);
        release3.setName("Cyber Exodus");
        cardReleaseSetService.save(release3);
    }
}
