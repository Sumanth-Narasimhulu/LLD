package BehaviouralDesginPatterns.TemplateDesginPattern.AuthenticationSystem;

public class OTPLogin extends LoginTemplate{

    @Override
    boolean authenticate(String userInput) {
        System.out.println("Login with OTP");
        return "1234".equals(userInput);
    }
    
    
}
