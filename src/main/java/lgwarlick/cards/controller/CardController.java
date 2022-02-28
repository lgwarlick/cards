package lgwarlick.cards.controller;

import lgwarlick.cards.model.CardType;
import lgwarlick.cards.service.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping("/card")
    public String card(Model model){

        model.addAttribute("card", cardService.findAll());

        return "card/allcards";
    }

    @RequestMapping({"/card/{cardType}", "/{cardType}"})
    public String listResources(@PathVariable String cardType, Model model){
        model.addAttribute("card", cardService.findAllByType(CardType.valueOf(cardType)));

        return "card/" + cardType;
    }

}
