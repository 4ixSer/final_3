package com.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by qny4i on 02.11.2016.
 */
@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "artist_name")

    private String name;

    @Column(name = "genre_222")
    private String genre;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums;

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public Artist() {

    }

    public Artist( String name, String genre) {

        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}