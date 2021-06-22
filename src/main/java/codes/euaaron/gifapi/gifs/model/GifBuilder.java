package codes.euaaron.gifapi.gifs.model;

import java.util.List;

public class GifBuilder {
    private final Gif gif;

    public GifBuilder() { this.gif = new Gif(); }

    public Gif build() {
        if(gif.getId().isBlank() || gif.getId().isEmpty() || gif.getId() == null)
            throw new NullPointerException("GIF ID is missing.");
        if(gif.getUrl().isBlank() || gif.getUrl().isEmpty() || gif.getUrl() == null)
            throw new NullPointerException("GIF URL is missing.");
        return gif;
    }

    public GifBuilder setId(String id) {
        gif.setId(id);
        return this;
    }

    public GifBuilder setTitle(String title) {
        gif.setTitle(title);
        return this;
    }

    public GifBuilder setUrl(String url) {
        gif.setUrl(url);
        return this;
    }

    public GifBuilder setProvider(String provider) {
        gif.setProvider(provider);
        return this;
    }

    public GifBuilder setTags(List<String> tags) {
        gif.setTags(tags);
        return this;
    }
}
