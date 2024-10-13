package creationalpatterns.factory;

import creationalpatterns.factory.idp.AzureIdentityProvider;
import creationalpatterns.factory.idp.IdentityProvider;
import creationalpatterns.factory.idp.OktaIdentityProvider;

/**
 * Factory Class Which Gives New Instance of the Implementation Based on the Input
 */
public class IdentityProviderFactory {
    private IdentityProviderFactory(){};


    public static IdentityProvider getIdentityProviderInstance(String idpName){
        IdentityProvider identityProviderInstance = null;

        switch(idpName){
            case "okta":
                identityProviderInstance =  new OktaIdentityProvider();
                break;
            case "azure":
                identityProviderInstance =  new AzureIdentityProvider();
                break;
        }

        return identityProviderInstance;
    }

}
