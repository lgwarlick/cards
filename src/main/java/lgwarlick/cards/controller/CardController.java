package lgwarlick.cards.controller;

import lgwarlick.cards.model.CardType;
import lgwarlick.cards.model.Faction;
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
    public String listCardsOfType(@PathVariable String cardType, Model model){
        model.addAttribute("card", cardService.findAllByType(CardType.valueOf(cardType.toUpperCase(Locale.ROOT))));

        return "card/" + cardType;
    }

    @RequestMapping({"/card/{faction}", "/{faction}"})
    public String listCardsOfFaction(@PathVariable String faction, Model model){
        model.addAttribute("card", cardService.findAllByFaction(Faction.valueOf(faction.toUpperCase(Locale.ROOT))));

        return "card/" + faction;
    }

}
