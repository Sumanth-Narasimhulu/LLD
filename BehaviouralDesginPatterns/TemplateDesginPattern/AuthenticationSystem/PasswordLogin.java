package BehaviouralDesginPatterns.TemplateDesginPattern.AuthenticationSystem;

public class PasswordLogin extends LoginTemplate {

    @Override
    boolean authenticate(String userInput) {
        System.out.println("logining with password");
        return "abc@123".equals(userInput);
    }
    
}
