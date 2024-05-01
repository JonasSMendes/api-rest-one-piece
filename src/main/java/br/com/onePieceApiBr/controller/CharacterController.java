package br.com.onePieceApiBr.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.onePieceApiBr.services.CharacterDateService;

@RestController
@RequestMapping("/")
public class CharacterController {

    private final CharacterDateService characterDateService;

    public CharacterController(CharacterDateService characterDateService) {
        this.characterDateService = characterDateService;
    }

    @GetMapping("character")
    List<Map<String, Object>> getAllCharacter() throws IOException {
        return characterDateService.getAllCharacters();
    }

}
