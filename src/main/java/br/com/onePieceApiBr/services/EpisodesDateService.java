package br.com.onePieceApiBr.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EpisodesDateService {

    private final ObjectMapper mapper = new ObjectMapper();
    private final File episodesFile = new File("src/main/resources/one_piece_episodes.json");

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> getAllEpisodes() throws IOException {
        return mapper.readValue(episodesFile, List.class);
    }

}