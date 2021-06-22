package codes.euaaron.gifapi.shared.config;

import org.springframework.stereotype.Component;


@Component
public class ApiConfiguration {
    private static final String TENOR_APIURL = "https://tenor.googleapis.com/v2/search";
    private static final String TENOR_APIKEY = "key=AIzaSyAl41UDG1pzJTekrzByCoOGASvk-j8VzkE";

    private static final String GIPHY_APIURL = "https://api.giphy.com/v1/gifs/search";
    private static final String GIPHY_APIKEY = "api_key=Gc7131jiJuvI7IdN0HZ1D7nh0ow5BU6g";

    public static String getTenorApiurl() {
        return TENOR_APIURL;
    }

    public static String getTenorApikey() {
        return TENOR_APIKEY;
    }

    public static String getGiphyApiurl() {
        return GIPHY_APIURL;
    }

    public static String getGiphyApikey() {
        return GIPHY_APIKEY;
    }
}
