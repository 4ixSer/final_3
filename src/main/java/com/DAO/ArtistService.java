package com.DAO;

import com.entity.Artist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by qny4i on 02.11.2016.
 */
public class ArtistService {
    public EntityManager em = Persistence.createEntityManagerFactory("Jpa").createEntityManager();



    public ArtistService(){


    }
   public ArtistService(EntityManager em) {
        this.em = em;
    }

    public Artist createArtist( Artist newArtist) {
        em.getTransaction().begin();
        Artist artist = newArtist;
        em.persist(artist);
        em.getTransaction().commit();
        return artist;
    }

    public void removeArtist(int id) {
        em.getTransaction().begin();
        Artist artist = em.find(Artist.class, id);

        if (artist != null) {
            em.remove(artist);
        }
        em.getTransaction().commit();
    }

    public Artist changeArtistGenre(int id, String genre) {
        em.getTransaction().begin();
        Artist artist = em.find(Artist.class, id);

        if (artist != null) {
            artist.setGenre(genre);
        }
        em.getTransaction().commit();
        return artist;
    }

    public Artist findArtist(int id) {
        em.getTransaction().begin();
        Artist artist = em.find(Artist.class, id);
        em.getTransaction().commit();
        return artist;

    }

    public List<Artist> findAllArtists() {
        TypedQuery<Artist> query = em.createQuery("SELECT a FROM Artist a", Artist.class);
        return query.getResultList();
    }
}