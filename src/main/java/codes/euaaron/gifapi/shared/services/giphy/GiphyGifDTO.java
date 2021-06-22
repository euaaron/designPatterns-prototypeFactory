package codes.euaaron.gifapi.shared.services.giphy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GiphyGifDTO {
    private String title;
    private String id;
    private List<String> tags;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public List<String> getTags() { return tags; }

    public void setTags(List<String> tags) { this.tags = tags; }
}
