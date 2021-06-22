package codes.euaaron.gifapi.shared.services.giphy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GiphyDTO {
    private List<GiphyGifDTO> data;

    public List<GiphyGifDTO> getData() { return data; }

    public void setData(List<GiphyGifDTO> data) { this.data = data; }
}
