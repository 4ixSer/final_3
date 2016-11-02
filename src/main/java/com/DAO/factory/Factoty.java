package com.DAO.factory;

import com.DAO.AlbumService;
import com.DAO.ArtistService;
import com.entity.Album;

/**
 * Created by qny4i on 02.11.2016.
 */
public class Factoty {


    private static ArtistService artistService = null;
    private static AlbumService albumService = null;
    private static Factoty instance = null;

    public static synchronized Factoty getInstance() {
        if (instance == null) {
            instance = new Factoty();
        }
        return instance;
    }

    public ArtistService getArtistDAO() {
        if (artistService == null) {
            artistService = new ArtistService();
        }
        return artistService;
    }

    public AlbumService getAlbumDAO() {
        if (albumService == null) {
            albumService = new AlbumService();
        }
        return albumService;
    }
}
