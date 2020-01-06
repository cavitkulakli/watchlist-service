package com.watchlist.controllers;

import com.watchlist.models.Kinds;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/kindscontroller")
public class KindsController {

    @RequestMapping("/getkinds")
    public Kinds getKinds() {
        List<String> kindTypes = new ArrayList<>();
        kindTypes.add("Books");
        kindTypes.add("Movies");
        kindTypes.add("Serials");
        return new Kinds(kindTypes);
    }

}
