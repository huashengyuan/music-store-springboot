package com.musicstore.common.model;

import java.io.Serializable;

public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;

    public String uuid;
    public String name;
    public String role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        return "Admin{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", isActive=" + isActive +
                ", isDeleted=" + isDeleted +
                '}';
    }
}