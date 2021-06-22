package codes.euaaron.gifapi.gifs.route;

import codes.euaaron.gifapi.gifs.model.Gif;
import codes.euaaron.gifapi.gifs.service.GifService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GifsController {

    @GetMapping("/Gifs")
    public List<Gif> Gifs(
            @RequestParam(value = "search", defaultValue = "java") String search,
            @RequestParam(value = "limit", defaultValue = "5") Integer limit
    ) {
        return GifService.getInstance().GetGifs(search, limit);
    }
}
