package StructuralDesignPatterns.FacadeDesginPattern.AuthSystem;

public class AuthFacade {
    private Auth auth;
    private LogService logService;
    private OTP otp;
    private  Session session;
    public AuthFacade(){
        auth = new Auth();
        logService = new LogService();
        otp = new OTP();
        session = new Session();
    }
    public void login(){
        System.out.println("logging in.....");
        System.out.println("====");
        auth.validate();
        System.out.println("user validated");
        System.out.println("====");
        otp.verify();
        System.out.println("otp verified");
        System.out.println("====");
        session.createSession();
        System.out.println("session created");
        System.out.println("====");
        logService.log();
        System.out.println("audit logged");


    }

}
