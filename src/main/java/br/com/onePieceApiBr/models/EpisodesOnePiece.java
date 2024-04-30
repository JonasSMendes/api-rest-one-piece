package br.com.onePieceApiBr.models;

import java.time.LocalDate;

public class EpisodesOnePiece {

    private String name;

    private Integer episodeNumber;

    private LocalDate datePublication;

    private double duration;

    private long id;

    public EpisodesOnePiece(long id, Integer episodeNumber, String name, double duration, LocalDate datePublication) {
        this.name = name;
        this.episodeNumber = episodeNumber;
        this.datePublication = datePublication;
        this.duration = duration;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEpisodeNumber() {
        return this.episodeNumber;
    }

    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public LocalDate getDatePublication() {
        return this.datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public double getDuration() {
        return this.duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

}