package BehaviouralDesginPatterns.TemplateDesginPattern.AuthenticationSystem;

public class Main {
    public static void main(String[] args) {
        LoginTemplate passwordLogin = new PasswordLogin();
        LoginTemplate otpLogin = new OTPLogin();
        passwordLogin.login("abc@123");
        otpLogin.login("1234");

    }
}
