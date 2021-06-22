package codes.euaaron.gifapi.shared.services.tenor;

import codes.euaaron.gifapi.gifs.model.Gif;
import codes.euaaron.gifapi.shared.config.ApiConfiguration;
import codes.euaaron.gifapi.shared.services.IGifProviderService;
import codes.euaaron.gifapi.shared.services.utils.GifParser;
import codes.euaaron.gifapi.shared.utils.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenorService implements IGifProviderService {
    private final String API_URL = ApiConfiguration.getTenorApiurl();
    private final String API_KEY = ApiConfiguration.getTenorApikey();

    public List<Gif> getGifs(String search, Integer limit) {
        String result = HttpClient.getInstance().doGet(API_URL + "?" + API_KEY + "&q=" + search + "&limit=" + limit);
        try {
            TenorDTO tenorGifs = new ObjectMapper().readValue(result, TenorDTO.class);
            return GifParser.ParseToGifList(tenorGifs.getResults(), TenorGifDTO.class);
        } catch (Exception e) {
            return null;
        }
    }
}
