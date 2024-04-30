package br.com.onePieceApiBr.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CharacterDateService {

    private final ObjectMapper mapper = new ObjectMapper();
    private final File charactersFile = new File("one_piece_characters.json");

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> getAllCharacters() throws IOException {
        return mapper.readValue(charactersFile, List.class);
    }

}
