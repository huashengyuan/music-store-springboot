package com.musicstore.common.model;

import java.io.Serializable;

public class Genre implements Serializable {
    private static final long serialVersionUID = 1L;

    public String uuid;
    public String name;
    public Boolean isActive;
    public Boolean isDeleted;

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
        return "Genre{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", isDeleted=" + isDeleted +
                '}';
    }
}

