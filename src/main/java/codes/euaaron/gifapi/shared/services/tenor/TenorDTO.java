package codes.euaaron.gifapi.shared.services.tenor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TenorDTO {
    private List<TenorGifDTO> results;

    public List<TenorGifDTO> getResults() { return results; }

    public void setResults(List<TenorGifDTO> results) { this.results = results; }
}
