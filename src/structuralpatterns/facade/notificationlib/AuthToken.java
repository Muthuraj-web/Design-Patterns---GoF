package structuralpatterns.facade.notificationlib;

public class AuthToken {
    private final String authToken;

    public AuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }
}
