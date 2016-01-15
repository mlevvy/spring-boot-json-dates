package io.lewandowski.tutorial.spring.jsonformatting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/clock", method = RequestMethod.GET)
    public Clock getClock() {
        return new Clock();
    }

}
