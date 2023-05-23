package co.develhope.swagger.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName() {
        return "My name is Salvo Scalisi";
    }
}

