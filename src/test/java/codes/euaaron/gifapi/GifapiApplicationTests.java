package codes.euaaron.gifapi;

import codes.euaaron.gifapi.gifs.model.Gif;
import codes.euaaron.gifapi.gifs.service.GifService;
import codes.euaaron.gifapi.shared.services.IGifProviderService;
import codes.euaaron.gifapi.shared.services.ServicesFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class GifapiApplicationTests {

    @Test
    void canGetGifsFromGiphy() {
        IGifProviderService service = ServicesFactory.getService("Giphy");

        List<Gif> gifs = service.getGifs("Tom-Roland", 12);

        assertFalse(gifs.isEmpty());
    }

    @Test
    void canGetGifsFromTenor() {
        IGifProviderService service = ServicesFactory.getService("Tenor");

        List<Gif> gifs = service.getGifs("Tom-Roland", 12);

        assertFalse(gifs.isEmpty());
    }

    @Test
    void canGetGifsBothProviders() {
        List<Gif> gifs = GifService.getInstance().GetGifs("Tom-Roland", 12);

        assertFalse(gifs.isEmpty());
    }

}
