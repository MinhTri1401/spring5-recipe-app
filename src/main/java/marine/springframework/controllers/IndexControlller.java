package marine.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControlller {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        return "index";
    }
}
