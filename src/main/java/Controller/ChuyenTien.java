package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChuyenTien {
    @GetMapping("/hung")
    public String showForm() {
        return "index";
    }
    @GetMapping("/huhi")
    public String conversion(@RequestParam double usd, double rate , Model model){
        double vnd = rate*usd;
        model.addAttribute("vnd",vnd);
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        return "currency";

    }
}
