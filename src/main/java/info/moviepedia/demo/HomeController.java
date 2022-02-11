package info.moviepedia.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HomeController {

    @GetMapping("")
    public String home() {
        log.info("index.jsp GET!");

        return "index";
    }
}
