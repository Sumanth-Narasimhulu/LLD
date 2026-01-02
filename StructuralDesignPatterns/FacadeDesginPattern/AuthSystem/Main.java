package StructuralDesignPatterns.FacadeDesginPattern.AuthSystem;

public class Main {
    public static void main(String[] args) {
        AuthFacade authFacade = new AuthFacade();
        authFacade.login();
    }
}
