package com.angelchanquin.springboot.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by achanquin on 2/28/17.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public void index() {

    }
}
