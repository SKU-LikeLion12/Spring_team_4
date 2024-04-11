package likelion.helloworld.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {


    @GetMapping("/hello") //http://localhost:8080/hello
    public String hello(){
        return "hello";
    }

    /*매개 변수 없이, 메서드 안에서 값을 할당*/
    @GetMapping("/hello-data") //http://localhost:8080/hello-data
    public String helloData(Model model){
        model.addAttribute("nameKey","dahyeon");
        return "hello";
    }

    /*url 경로에 변수에 할당할 값을 경로로써 작성*/
    @GetMapping("/hello/{name}/{age}") //http://localhost:8080/hello/hihi/10
    public String helloPath(@PathVariable String name, @PathVariable String age,Model model){
        model.addAttribute("nameKey",name);
        model.addAttribute("age",age);
        return "hello";
    }

    /*url 경로에 변수에 할당할 값을 작성*/
    @GetMapping("/hello-param") //http://locaohost:8080/hello-param?nameKey=asdf
    public String helloParam(@RequestParam("nameKey") String name,Model model){
        model.addAttribute("nameKey",name);
        return "hello";
    }
}
