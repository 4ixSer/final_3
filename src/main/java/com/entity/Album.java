package com.entity;

import javax.persistence.*;
/**
 * Created by qny4i on 02.11.2016.
 */
@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "album_id")
    private int id;

    @Column(name = "album_name")
    private String name;

    @Column(name = "album_year")
    private int year;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Album() {

    }

    public Album( String name, int year,Artist artist) {

        this.name = name;
        this.year = year;
        this.artist=artist;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}