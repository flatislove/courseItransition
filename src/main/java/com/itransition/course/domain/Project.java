package com.itransition.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int developers;//many to many
    private String description;
    private int tags;//many to many

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDevelopers() {
        return developers;
    }

    public void setDevelopers(int developers) {
        this.developers = developers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTags() {
        return tags;
    }

    public void setTags(int tags) {
        this.tags = tags;
    }
}
