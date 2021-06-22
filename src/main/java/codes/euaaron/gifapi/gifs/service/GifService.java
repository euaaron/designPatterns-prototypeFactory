package codes.euaaron.gifapi.gifs.service;

import codes.euaaron.gifapi.gifs.model.Gif;
import codes.euaaron.gifapi.shared.services.IGifProviderService;
import codes.euaaron.gifapi.shared.services.ServicesFactory;

import java.util.ArrayList;
import java.util.List;

public class GifService {
    private static final GifService instance = new GifService();
    private final IGifProviderService tenor;
    private final IGifProviderService giphy;

    GifService() {
        tenor = ServicesFactory.getService("Tenor");
        giphy = ServicesFactory.getService("Giphy");
    }

    public static GifService getInstance() { return instance; }

    public List<Gif> GetGifs(String search, Integer limit) {
        // Divides limit by two
        Integer halfLimit = limit / 2;

        // Initialize our gifs result list
        List<Gif> result = new ArrayList<>();

        // Search and Get GIFs on Giphy API
        List<Gif> giphyGIFs = giphy.getGifs(search, halfLimit);

        // Search and Get GIFs on Tenor API
        List<Gif> tenorGIFs = tenor.getGifs(search, halfLimit);

        // Adds both results to our result list
        result.addAll(giphyGIFs);
        result.addAll(tenorGIFs);

        // Returns a list with GIFs from both providers
        return result;
    }
}
