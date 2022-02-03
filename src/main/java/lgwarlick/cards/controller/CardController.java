package lgwarlick.cards.controller;

import lgwarlick.cards.service.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping("/card")
    public String card(Model model){

        model.addAttribute("card", cardService.findAll());

        return "card.html";
    }

}
