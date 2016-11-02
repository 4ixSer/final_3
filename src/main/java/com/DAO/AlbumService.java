package com.DAO;

import com.entity.Album;
import com.entity.Artist;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AlbumService {
    public EntityManager em = Persistence.createEntityManagerFactory("Jpa").createEntityManager();

    public AlbumService(){

    }

    public AlbumService(EntityManager em) {
        this.em = em;
    }

    public Album createAlbum(Album newAlbum) {
        em.getTransaction().begin();
        Album album = newAlbum;
        em.persist(album);
        em.getTransaction().commit();

        return album;
    }

    public void removeAlbum(int id) {
        em.getTransaction().begin();
        Album album = em.find(Album.class, id);

        if (album != null) {
            em.remove(album);
        }
        em.getTransaction().commit();
    }

    public Album changeAlbumName(int id, String name) {
        em.getTransaction().begin();
        Album album = em.find(Album.class, id);

        if (album != null) {
            album.setName(name);
        }
        em.getTransaction().commit();
        return album;
    }

    public Album findAlbum(int id) {
        em.getTransaction().begin();
        Album alb =em.find(Album.class, id);
                em.getTransaction().commit();
        return alb;
    }

    public List<Album> findAllAlbums() {
        em.getTransaction().begin();
        TypedQuery<Album> query = em.createQuery("SELECT a FROM Album a", Album.class);
        em.getTransaction().commit();
        return query.getResultList();
    }
}