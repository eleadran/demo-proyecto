package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login"; // El archivo login.html
    }
    @PostMapping("/validateEmail")
    public String validateEmail(@RequestParam String email) {
        // Lista de correos permitidos
        List<String> allowedEmails = Arrays.asList(
                "alonso_tocas@trimotors.com",
                "adrian_infantes@trimotors.com",
                "daniela_cisneros@trimotors.com"
        );

        // Verificar si el correo está en la lista
        if (allowedEmails.contains(email)) {
            return "redirect:/servidor"; // Redirige a servidor.html
        } else {
            return "redirect:/home"; // Redirige a home.html
        }
    }

}
