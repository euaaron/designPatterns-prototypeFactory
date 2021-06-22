package codes.euaaron.gifapi.shared.services;

public class ServicesFactory {

    public static IGifProviderService getService(String service) {
        Class<?> classe;
        Object objecto = null;
        try {
            classe = Class.forName("codes.euaaron.gifapi.shared.services." + service.toLowerCase() + "." + service + "Service");
            objecto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("This service doesn't exist!");
        }
        if(!(objecto instanceof IGifProviderService))
            throw new IllegalArgumentException("Invalid service!");
        return (IGifProviderService) objecto;
    }
}
