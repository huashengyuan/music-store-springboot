package com.musicstore.common.model;

import java.io.Serializable;

public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;

    public String uuid;
    public String name;
    public String role;
    public Boolean is_active;
    public Boolean is_deleted;

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
        return "Admin{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", is_acitve=" + is_active +
                ", is_deleted=" + is_deleted +
                '}';
    }
}