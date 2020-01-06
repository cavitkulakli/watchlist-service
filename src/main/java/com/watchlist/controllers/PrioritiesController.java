package com.watchlist.controllers;

import com.watchlist.models.Priorities;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prioritiescontroller")
public class PrioritiesController {

    @RequestMapping("/getpriorities")
    public Priorities getKinds() {
        List<String> priorityTypes = new ArrayList<>();
        priorityTypes.add("no");
        priorityTypes.add("low");
        priorityTypes.add("medium");
        priorityTypes.add("high");
        return new Priorities(priorityTypes);
    }

}
