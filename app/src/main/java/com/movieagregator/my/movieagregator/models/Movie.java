package com.movieagregator.my.movieagregator.models;

public class Movie {
    String id;
    String title;
    String overview;
    float voteAvarage;
    float voteCount;
    String posterPath;
    String backdropPath;

    public Movie(
            String id,
            String title,
            String overview,
            float voteAvarage,
            float voteCount,
            String posterPath,
            String backdropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.voteAvarage = voteAvarage;
        this.voteCount = voteCount;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getVoteAvarage() {
        return voteAvarage;
    }

    public void setVoteAvarage(float voteAvarage) {
        this.voteAvarage = voteAvarage;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w500/", posterPath);
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }
}
