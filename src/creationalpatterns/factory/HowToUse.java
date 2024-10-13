package creationalpatterns.factory;

import creationalpatterns.factory.idp.IdentityProvider;

public class HowToUse {
    public static void main(String[] args) {

        // Getting the Particular Implementation of IdentityProvider based on Input
        IdentityProvider idp = IdentityProviderFactory.getIdentityProviderInstance("okta");
        idp.authenticateUser("example@example.com","password");
    }
}
