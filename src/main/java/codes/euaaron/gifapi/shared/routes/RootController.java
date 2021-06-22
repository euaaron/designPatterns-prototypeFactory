package codes.euaaron.gifapi.shared.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    public String Root() {
        return   "Welcome to GIFAPI!\n"
                + "<h1>Go to localhost:8080/gif?search=yourSearchTerm</h1>\n"
                + "You can also limit results to any number. Ex.: Limit to 15 by adding ?limit=15 to the end of the URL.\n"
                + "This API searchs GIFs from Tenor and Giphy simultaneously, so we can always find the GIF that you want!"
                + "<small>API made by <a href='https://github.com/euaaron'>Aaron Carneiro</a></small>";
    }
}
