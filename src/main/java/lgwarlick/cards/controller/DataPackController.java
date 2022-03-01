package lgwarlick.cards.controller;

import lgwarlick.cards.service.DataPackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataPackController {

    private final DataPackService dataPackService;

    public DataPackController(DataPackService dataPackService) {
        this.dataPackService = dataPackService;
    }

    @RequestMapping("/set")
    public String allReleaseSets(Model model){

        model.addAttribute("datapack", dataPackService.findAll());

        return "datapack";
    }

}
