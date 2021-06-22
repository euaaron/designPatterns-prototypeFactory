package codes.euaaron.gifapi.shared.services.tenor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TenorGifDTO {
    private String id;
    private String h1_title;
    private String url;
    private List<String> tags;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getH1_title() {
        return h1_title;
    }

    public void setH1_title(String h1_title) {
        this.h1_title = h1_title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
