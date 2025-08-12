package application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/")
public class IndexController {
    //private List<String> frutas = Arrays.asList("Maça", "Uva", "Banana");
    private List<String> frutas = new ArrayList<>();

    @GetMapping
    public List<String> home() {
        return frutas;
    }

    @PostMapping
    public List<String> insert(@RequestBody String fruta) {
        frutas.add(fruta);
        return frutas;
    }
}