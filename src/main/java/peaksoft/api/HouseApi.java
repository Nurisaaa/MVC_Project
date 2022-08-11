package peaksoft.api;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import peaksoft.db.service.HouseService;

@Controller
@AllArgsConstructor
public class HouseApi {

    @GetMapping
    private String getAllHouses(){
//        model.addAttribute("AllHouses", houseService.getAllHouse());
        return "/index";
    }
}
