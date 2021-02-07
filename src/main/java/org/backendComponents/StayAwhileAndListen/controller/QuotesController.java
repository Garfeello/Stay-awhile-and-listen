package org.backendComponents.StayAwhileAndListen.controller;

import org.backendComponents.StayAwhileAndListen.model.Diablo2Character;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stayAwhile")
@CrossOrigin(origins = "http://localhost:3000")
public class QuotesController {

    @GetMapping("/test")
    private Diablo2Character test() {
        Diablo2Character diablo2Character = new Diablo2Character();
        diablo2Character.setDescription("description");
        diablo2Character.setName("TROLOLO");
        return diablo2Character;
    }
}
