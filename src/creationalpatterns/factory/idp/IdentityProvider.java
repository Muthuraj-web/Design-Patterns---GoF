package creationalpatterns.factory.idp;

public interface IdentityProvider {

    public boolean authenticateUser(String email,String password);

    public boolean resetUserPassword(String email,String newPassword);
}
