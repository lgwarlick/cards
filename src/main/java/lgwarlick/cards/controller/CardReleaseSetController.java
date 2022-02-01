package lgwarlick.cards.controller;

import lgwarlick.cards.service.CardReleaseSetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardReleaseSetController {

    private final CardReleaseSetService cardReleaseSetService;

    public CardReleaseSetController(CardReleaseSetService cardReleaseSetService) {
        this.cardReleaseSetService = cardReleaseSetService;
    }

    @RequestMapping("/set")
    public String allReleaseSets(Model model){

        model.addAttribute("cardreleaseset", cardReleaseSetService.findAll());

        return "cardreleaseset.html";
    }

}
