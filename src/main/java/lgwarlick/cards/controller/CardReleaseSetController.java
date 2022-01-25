package lgwarlick.cards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardReleaseSetController {

    @RequestMapping("/set")
    public String allCardsInReleaseSet(){
        return "cardreleaseset";
    }

}
