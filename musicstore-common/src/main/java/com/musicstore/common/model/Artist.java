package com.musicstore.common.model;

import java.io.Serializable;

public class Artist implements Serializable {
    private static final long serialVersionUID = 1L;

    private String uuid;
    private String name;
    private String photo;
    private Boolean isActive;
    private Boolean isDeleted;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
        return "Artist{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", isActive=" + isActive +
                ", isDeleted=" + isDeleted +
                '}';
    }
}

