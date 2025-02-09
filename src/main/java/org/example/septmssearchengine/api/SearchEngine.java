package org.example.septmssearchengine.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchEngine")
public class SearchEngine {


    @GetMapping("/search")
    public String search() {
        return "Inside the search engine";
    }
}
