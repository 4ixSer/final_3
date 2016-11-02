package com;

import com.DAO.ArtistService;
import com.DAO.factory.Factoty;
import com.entity.Album;
import com.entity.Artist;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by qny4i on 02.11.2016.
 */
public class main {
    public static void main(String[] args) {
//        EntityManager em = Persistence.createEntityManagerFactory("Jpa").createEntityManager();

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa");
//        EntityManager em = emf.createEntityManager();
//        ArtistService service = new ArtistService(em);

//        System.out.println("--- Create and persist artist ---");

//        Factoty.getInstance().getArtistDAO().createArtist("Franz Ferdinand", "Rock");
//        Factoty.getInstance().getArtistDAO().createArtist("Depsa Erdsaand", "Dask");
//        Factoty.getInstance().getArtistDAO().createArtist("Franz Ferdinand", "Rock");

//            Artist artist1 =new Artist();
//            artist1.setName("Едик");
//            artist1.setGenre("Комедия");
//
//        Album album1= new Album();
//        album1.setName("В лесу");
//        album1.setYear(2045);
//
//        Album album2= new Album();
//        album2.setName("Мишка на севере");
//        album2.setYear(1905);
//
//        album1.setArtist(artist1);
//        album2.setArtist(artist1);
//
//        List<Album> albumSet =new ArrayList<Album>();
//        albumSet.add(album1);
//        albumSet.add(album2);
//
//
//
//        artist1.setAlbums(albumSet);
//

//       Factoty.getInstance().getArtistDAO().createArtist(artist1);
//        Factoty.getInstance().getAlbumDAO().createAlbum(album1);
//        Factoty.getInstance().getAlbumDAO().createAlbum(album2);

//        System.out.println("--- Find artist ---");

        for (int k = 1; k <3 ; k++) {
            Artist art1=  Factoty.getInstance().getArtistDAO().findArtist(k);
            System.out.println("-----Актеры-------");
            System.out.println("1. айди актера -"+ art1.getId());
            System.out.println("2. имя актера -"+ art1.getName());
            System.out.println("3. его жанр -"+ art1.getGenre());
            System.out.println("-----Дискография-------");
            for (int i = 0; i < art1.getAlbums().size(); i++) {
                System.out.println(i);
                System.out.println("Имя альбома "+ art1.getAlbums().get(i).getName());
                System.out.println("Имя чета там "+art1.getAlbums().get(i).getYear());
            }
        }


//        artist = service.findArtist(1);
//        System.out.println(String.format("Found: %s\n",  Factoty.getInstance().getArtistDAO().findArtist(2)));
//        System.out.println(String.format("Found: %s\n",  Factoty.getInstance().getArtistDAO().findArtist(5)));
//        System.out.println(String.format("Found: %s\n",  Factoty.getInstance().getArtistDAO().findArtist(12)));

//        System.out.println("delete");
//        Factoty.getInstance().getArtistDAO().removeArtist(20);

//        Factoty.getInstance().getArtistDAO().changeArtistGenre(3,"CHANGE");
//        System.out.println("--- Find all artists ---");
//        List<Artist> artists = Factoty.getInstance().getArtistDAO().findAllArtists();
//        for (Artist foundArtist : artists) {
//            System.out.println(String.format("Found: %s\n", foundArtist));
//        }

//        System.out.println("--- Update artist ---");
//        transaction.begin();
//        artist = service.changeArtistGenre(1, "Indie Rock");
//        transaction.commit();
//        System.out.println(String.format("Updated: %s\n", artist));


    }
}


