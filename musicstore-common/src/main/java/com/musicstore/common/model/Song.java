package com.musicstore.common.model;

import java.io.Serializable;

public class Song implements Serializable {
    private static final long serialVersionUID = 1L;

    public String uuid;
    public String artist_uuid;
    public String genre_uuid;
    public String name;
    public Float price;
    public String file;
    public Boolean is_active;
    public Boolean is_deleted;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getArtist_uuid() {
        return artist_uuid;
    }

    public void setArtist_uuid(String artist_uuid) {
        this.artist_uuid = artist_uuid;
    }

    public String getGenre_uuid() {
        return genre_uuid;
    }

    public void setGenre_uuid(String genre_uuid) {
        this.genre_uuid = genre_uuid;
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

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "Song{" +
                "uuid='" + uuid + '\'' +
                ", artist_uuid='" + artist_uuid + '\'' +
                ", genre_uuid='" + genre_uuid + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", file='" + file + '\'' +
                ", is_active=" + is_active +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
