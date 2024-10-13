package creationalpatterns.factory.idp;

public class OktaIdentityProvider implements IdentityProvider {

    @Override
    public boolean authenticateUser(String email, String password) {
        return true;
    }

    @Override
    public boolean resetUserPassword(String email, String newPassword) {
        return true;
    }
}
