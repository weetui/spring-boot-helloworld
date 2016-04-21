package com.zixin.entity;

import java.io.Serializable;

/**
 * <p>User: Louis
 * <p>Date: 16-04-20
 * <p>Version: 1.0
 */
public class User implements Serializable {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
