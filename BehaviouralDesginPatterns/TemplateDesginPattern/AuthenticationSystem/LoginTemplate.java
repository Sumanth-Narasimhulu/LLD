package BehaviouralDesginPatterns.TemplateDesginPattern.AuthenticationSystem;

public abstract class LoginTemplate {
    public final void login(String userInput){
        ValidateUserInput(userInput);
        boolean authenticated = authenticate(userInput);
        logActivity(userInput,authenticated);
        sendResponse(authenticated);
    }
    public void ValidateUserInput(String userInput){
        System.out.println("Validating UserInput...");
    }
    abstract boolean authenticate(String userInput);
    public void logActivity(String userInput,boolean status){
        System.out.println("User login "+status);
    }
    public void sendResponse(boolean status){
        if(status)System.out.println("Login Successful");
        else System.out.println("Login unsuccessful");
    }
}
