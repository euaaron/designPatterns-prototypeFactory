package codes.euaaron.gifapi.shared.services.utils;

import codes.euaaron.gifapi.gifs.model.Gif;
import codes.euaaron.gifapi.gifs.model.GifBuilder;
import codes.euaaron.gifapi.shared.services.giphy.GiphyGifDTO;
import codes.euaaron.gifapi.shared.services.tenor.TenorGifDTO;

import java.util.ArrayList;
import java.util.List;

public class GifParser {

    public static Gif ParseTenor(TenorGifDTO provider) {
        Gif parsed = new GifBuilder()
                .setId(provider.getId())
                .setTitle(provider.getH1_title())
                .setProvider("Tenor")
                .setUrl(provider.getUrl())
                .setTags(provider.getTags())
                .build();
        try {
            return parsed.clone();
        } catch(Exception e) {
            return null;
        }
    }

    public static Gif ParseGiphy(GiphyGifDTO provider) {
        Gif parsed = new GifBuilder()
                .setId(provider.getId())
                .setTitle(provider.getTitle())
                .setProvider("Giphy")
                .setUrl("https://i.giphy.com/media/" + provider.getId() + "/giphy.gif")
                .setTags(provider.getTags())
                .build();
        try {
            return parsed.clone();
        } catch(Exception e) {
            return null;
        }
    }

    public static <T> List<Gif> ParseToGifList(List<T> gifData, Class<T> classe) {
        List<Gif> result = new ArrayList<>();
        try {
            Object objecto = classe.getDeclaredConstructor().newInstance();
            if(objecto instanceof GiphyGifDTO) {
                gifData.forEach(element -> result.add(ParseGiphy((GiphyGifDTO) element)));
                return result;
            }
            if(objecto instanceof TenorGifDTO) {
                gifData.forEach( element -> result.add(ParseTenor((TenorGifDTO) element)));
                return result;
            }
            return result;
        } catch(Exception e) {
            return result;
        }
    }

}
