package codes.euaaron.gifapi.shared.services.giphy;

import codes.euaaron.gifapi.gifs.model.Gif;
import codes.euaaron.gifapi.shared.config.ApiConfiguration;
import codes.euaaron.gifapi.shared.services.IGifProviderService;
import codes.euaaron.gifapi.shared.services.utils.GifParser;
import codes.euaaron.gifapi.shared.utils.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiphyService implements IGifProviderService {
    private final String API_URL = ApiConfiguration.getGiphyApiurl();
    private final String API_KEY = ApiConfiguration.getGiphyApikey();

    public List<Gif> getGifs(String search, Integer limit) {
        String result = HttpClient.getInstance().doGet(API_URL + "?" + API_KEY + "&q=" + search + "&limit=" + limit);
        try {
            GiphyDTO giphyGifs = new ObjectMapper().readValue(result, GiphyDTO.class);

            return GifParser.ParseToGifList(giphyGifs.getData(), GiphyGifDTO.class);
        } catch (Exception e) {
            return null;
        }
    }
}
