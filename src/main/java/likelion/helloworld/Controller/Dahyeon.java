package likelion.helloworld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dahyeon {
    @GetMapping("/dahyeon")
    public String dahyeon(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "dahyeon";
    }
}
