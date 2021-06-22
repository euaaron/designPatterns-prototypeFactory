package codes.euaaron.gifapi.shared.services;

import codes.euaaron.gifapi.gifs.model.Gif;

import java.util.List;

public interface IGifProviderService {
    List<Gif> getGifs(String search, Integer limit);
}
