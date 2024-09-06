package ir.freeland.springboot.register;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String processRegistration(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("dob") String dob,
            @RequestParam("email") String email,
            Model model) {
        
        boolean hasError = false;

        // Validate fields
        if (firstName.isEmpty()) {
            model.addAttribute("errorFirstName", "First name is required.");
            hasError = true;
        }
        if (lastName.isEmpty()) {
            model.addAttribute("errorLastName", "Last name is required.");
            hasError = true;
        }
        if (dob.isEmpty()) {
            model.addAttribute("errorDob", "Date of birth is required.");
            hasError = true;
        }
        if (email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            model.addAttribute("errorEmail", "Valid email is required.");
            hasError = true;
        }

        if (hasError) {
            return "register"; // بازگشت به فرم ثبت‌نام با پیام‌های خطا
        }

        // Add user info to the model to display in the confirmation page
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("dob", dob);
        model.addAttribute("email", email);

        return "confirmation"; // هدایت به صفحه تأیید
    }
}
