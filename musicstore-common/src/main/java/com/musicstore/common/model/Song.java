package com.musicstore.common.model;

import java.io.Serializable;

public class Song implements Serializable {
    private static final long serialVersionUID = 1L;

    private String uuid;
    private String artistUuid;
    private String genreUuid;
    private String name;
    private Float price;
    private String file;
    private Boolean isActive;
    private Boolean isDeleted;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getArtistUuid() {
        return artistUuid;
    }

    public void setArtistUuid(String artistUuid) {
        this.artistUuid = artistUuid;
    }

    public String getGenreUuid() {
        return genreUuid;
    }

    public void setGenreUuid(String genreUuid) {
        this.genreUuid = genreUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Song{" +
                "uuid='" + uuid + '\'' +
                ", artistUuid='" + artistUuid + '\'' +
                ", genreUuid='" + genreUuid + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", file='" + file + '\'' +
                ", isActive=" + isActive +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
