package codes.euaaron.gifapi.gifs.model;

import java.util.List;

public class Gif implements Cloneable {
    private String id;
    private String title;
    private String url;
    private String provider;
    private List<String> tags;

    public Gif () {}

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<String> getTags() { return tags; }

    public void setTags(List<String> tags) { this.tags = tags; }

    @Override
    public Gif clone() throws CloneNotSupportedException {
        return (Gif) super.clone();
    }
}
