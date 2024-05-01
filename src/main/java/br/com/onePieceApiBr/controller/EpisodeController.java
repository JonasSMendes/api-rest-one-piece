package br.com.onePieceApiBr.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.onePieceApiBr.services.EpisodesDateService;

@RestController
@RequestMapping("/")
public class EpisodeController {

    private final EpisodesDateService episodesDateService;

    public EpisodeController(EpisodesDateService episodesDateService) {
        this.episodesDateService = episodesDateService;
    }

    @GetMapping("episodes")
    public List<Map<String, Object>> getAllEpisodes() throws IOException {
        return episodesDateService.getAllEpisodes();
    }
}
