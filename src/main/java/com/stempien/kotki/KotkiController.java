package com.stempien.kotki;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class KotkiController {
        @GetMapping("/cats")
        public String showHelloPage(Model model, @ModelAttribute("formData") Cat formData) {
            model.addAttribute("formData", new Cat());
            if (formData.getCatColor().equals("white"))
                formData.setImage("/whiteCat.jpg");
            else if (formData.getCatColor().equals("orange"))
                formData.setImage("/orangeCat.jpg");
            else
                formData.setImage("/blackCat.jpg");
            return "page";
    }
}
